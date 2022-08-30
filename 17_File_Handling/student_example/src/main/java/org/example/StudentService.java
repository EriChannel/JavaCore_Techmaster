package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bethanne Bass", LocalDate.of(2000, 12, 3),
                "Male", 7,5,5.5,9));
        students.add(new Student("Krissie Carabine", LocalDate.of(2000, 7, 13),
                "Female", 9,8.5,5,7));
        students.add(new Student("Law Igglesden", LocalDate.of(2000, 1, 1),
                "Male", 8,7.25,7,5));
        students.add(new Student("Roxi Darbon", LocalDate.of(2000, 3, 12),
                "Female", 5,5,4.5,4));
        students.add(new Student("Jeffry Jandl", LocalDate.of(2000, 11, 24),
                "Male", 3,2,2.25,4));
        students.add(new Student("Raddy Alenichicov", LocalDate.of(2000, 9, 7),
                "Female", 9,9,8.5,8));
        students.add(new Student("Ginelle Camilio", LocalDate.of(2000, 12, 29),
                "Male", 8,7,7.5,6.5));
        students.add(new Student("Seumas Ramas", LocalDate.of(2000, 4, 2),
                "Male", 7,8,8.5,6));
        students.add(new Student("Noreen Ambage", LocalDate.of(2000, 10, 17),
                "Female", 7,7,8.5,9));
        students.add(new Student("Trixy Glaserman", LocalDate.of(2000, 12, 22),
                "Female", 9,8.5,7.5,6));
        return students;
    }
}
