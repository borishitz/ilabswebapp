package com.noah.sarknext2.noah.sarknext2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Long phoneNumber;

    private String messageDetail;

}
