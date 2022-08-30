package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
//        try {
//            FileReader fr = new FileReader("data.csv");
//
//            CSVReader csvReader = new CSVReader(fr);
//
//            String[] records;
//            while((records = csvReader.readNext()) != null){
//                for (String cell : records) {
//                    System.out.print(cell + "\t");
//                }
//                System.out.println();
//            }
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (CsvValidationException e) {
//            throw new RuntimeException(e);
//        }

        List<String[]> list = new ArrayList<>();
        try{
            FileReader fr = new FileReader("data.csv");

            CSVReader csvReader = new CSVReader(fr);
            list = csvReader.readAll();
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }

        for(String[] row: list){
            for (String cell : row){
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
