package com.noah.sarknext2.noah.sarknext2.services;

import com.noah.sarknext2.noah.sarknext2.entity.Role;
import com.noah.sarknext2.noah.sarknext2.entity.User;
import com.noah.sarknext2.noah.sarknext2.registration.RegistrationRequest;
import com.noah.sarknext2.noah.sarknext2.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User registerUser(RegistrationRequest registration) {
        var user = new User(registration.getFirstName(),
                registration.getFirstName(),
                registration.getEmail(),
                passwordEncoder.encode(registration.getPassword()),
                Arrays.asList(new Role("ROLE_USER")));
                return user;
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email)
                .orElseThrow(()->new UsernameNotFoundException("User not found"));
    }
}
