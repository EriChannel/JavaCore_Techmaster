import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "MyFile.txt";
//        FileReader reader = new FileReader(fileName);
//        try {
//            int i;
//            while ((i = reader.read()) != -1){
//                System.out.println((char)i);
//            }
//        }finally {
//            reader.close();
//        }
        FileWriter writer = new FileWriter(fileName);
        try {
            writer.write("Welcome");
        }finally {
            writer.close();
        }
    }
}