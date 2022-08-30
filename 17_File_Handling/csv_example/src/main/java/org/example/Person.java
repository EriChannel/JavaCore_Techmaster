package org.example;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String email;

    @CsvBindByName
    private String mobile;

    @CsvBindByName
    private String address;


}
