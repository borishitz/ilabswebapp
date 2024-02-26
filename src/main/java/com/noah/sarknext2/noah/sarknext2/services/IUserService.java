package com.noah.sarknext2.noah.sarknext2.services;

import com.noah.sarknext2.noah.sarknext2.entity.User;
import com.noah.sarknext2.noah.sarknext2.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getAllUsers();

    User registerUser(RegistrationRequest registrationRequest);
    User findByEmail(String email);
}
