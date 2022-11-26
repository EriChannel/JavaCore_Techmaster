package org.example.model.account;

import java.time.LocalDate;

public class Administrator extends Account {
    public Administrator() {
    }

    public Administrator(int id, String mobile, String password, String fullName, String email, Gender gender, LocalDate dob, Address address, AccountStatus status, Role role) {
        super(id, mobile, password, fullName, email, gender, dob, address, status, role);
    }
}
