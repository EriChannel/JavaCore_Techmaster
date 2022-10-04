package org.example;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVHandling {
    public List<Person> csvToBean(){
        List<Person> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("data.csv");
            CsvToBeanBuilder<Person> csvToBeanBuilder =
                    new CsvToBeanBuilder<>(reader);

            list = csvToBeanBuilder.withType(Person.class).build().parse();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public void beanToCSV(List<Person> list){

        try {
            FileWriter writer = new FileWriter("my_file.csv");
            StatefulBeanToCsvBuilder<Person> beanToCsvBuilder =
                    new StatefulBeanToCsvBuilder<Person>(writer);

            beanToCsvBuilder.withApplyQuotesToAll(false)
                    .build().write(list);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvRequiredFieldEmptyException e) {
            throw new RuntimeException(e);
        } catch (CsvDataTypeMismatchException e) {
            throw new RuntimeException(e);
        }
    }
}
