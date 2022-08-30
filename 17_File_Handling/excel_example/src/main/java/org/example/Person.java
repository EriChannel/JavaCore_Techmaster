package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Person {
    private int id;
    private String name;
    private Date dob;
    private String gender;
    private String email;
    private String mobile;

}
