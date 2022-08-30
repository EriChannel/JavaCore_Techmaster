package org.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String excelFilePath = "Students.xlsx";
        Controller.writeExcel(excelFilePath);
    }
}
