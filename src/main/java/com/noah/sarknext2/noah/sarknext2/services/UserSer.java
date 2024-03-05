package com.noah.sarknext2.noah.sarknext2.services;

import com.noah.sarknext2.noah.sarknext2.domain.User;
import com.noah.sarknext2.noah.sarknext2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserSer {
    @Autowired
    public UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public long countUser(){
        long count = userRepo.count();
        return count;
    }
}
