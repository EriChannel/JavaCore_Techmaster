package org.example;

import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.text.translate.CsvTranslators;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvToBean {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("data.csv");
            CsvToBeanBuilder<Person> csvToBeanBuilder =
                    new CsvToBeanBuilder<Person>(fileReader);

            personList = csvToBeanBuilder.withType(Person.class).build().parse();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Person p : personList){
            System.out.println(p.getName() + " - " + p.getEmail() + " - " +
                    p.getMobile() + " - " + p.getAddress());
        }

    }
}
