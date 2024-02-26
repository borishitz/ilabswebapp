package com.noah.sarknext2.noah.sarknext2.registration;

import com.noah.sarknext2.noah.sarknext2.entity.Role;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.util.Collection;

@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Collection<Role> roles;
}
