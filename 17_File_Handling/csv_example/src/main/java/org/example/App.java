package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        var list = readCSV();
//
//        for(String[] row : list){
//            for(String cell : row){
//                System.out.print(cell + "\t");
//            }
//            System.out.println();
//        }
//
//        writeCSV(list);
        CSVHandling csvHandling = new CSVHandling();
        List<Person> list = csvHandling.csvToBean();
        for(Person p : list){
            System.out.println(p.getFullName() + " - " + p.getEmail() +
                    " - " + p.getMobile() + " - " + p.getAddress());
        }

        csvHandling.beanToCSV(list);
    }

    public static List<String[]> readCSV(){
        List<String[]> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("data.csv");

            CSVReader csvReader = new CSVReader(reader);

            list = csvReader.readAll();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void writeCSV(List<String[]> list ){
        try {
            FileWriter writer = new FileWriter("test.csv");
            CSVWriter csvWriter = new CSVWriter(writer);
            csvWriter.writeAll(list);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
