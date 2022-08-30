package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private String name;
    private LocalDate dob;
    private String gender;
    private double math;
    private double physics;
    private double chemistry;
    private double literature;
}
