package org.example;

import java.io.IOException;
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
//            List<User> list = ReadFileExcel.readExcel("read_file.xlsx");
//            for(User user : list){
//                System.out.println(user.getId() + " - " + user.getName() +
//                        " - " + user.getEmail() + " - " + user.getMobile() +
//                        " - " + user.getAddress());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            WriteFileExcel.writeExcel("users.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
