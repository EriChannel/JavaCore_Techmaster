import java.io.*;

public class Main {
    public static void main(String[] args)  {
        try {
            FileWriter writer = new FileWriter("Data.txt", true);

            writer.write("Học java");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(){
        String fileName = "MyFile.txt";
        File file = new File(fileName);
        try {
            FileReader reader = new FileReader(file);
            int i;
            while ((i = reader.read()) != -1){
                System.out.print((char)i);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}