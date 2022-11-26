package org.example.model.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {

    private int id;

    private String mobile;

    private String password;

    private String fullName;

    private String email;

    private Gender gender;

    private LocalDate dob;

    private Address address;

    private AccountStatus status;

    private Role role;
}
