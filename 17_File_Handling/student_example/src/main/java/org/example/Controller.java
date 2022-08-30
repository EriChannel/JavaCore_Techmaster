package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static List<Student> getStudents(){
        StudentService service = new StudentService();
        return service.getStudents();
    }

    public static void writeExcel(String excelFilePath) throws IOException {
        //Tạo Workbook
        Workbook workbook = FileExcel.getWorkbook(excelFilePath);

        //Tạo sheet
        Sheet sheet = workbook.createSheet("Lớp 10A");

        //Xử lý phần header, header có rowindex là 0
        int rowIndex = 0;
        FileExcel.writeHeader(sheet, rowIndex);

        int numberColumn = sheet.getRow(0).getPhysicalNumberOfCells();
        FileExcel.autosizeColumn(sheet, numberColumn);
        //Tạo file excel
        FileExcel.createOutputFile(workbook, excelFilePath);
    }

    //Tạo Workbook

}
