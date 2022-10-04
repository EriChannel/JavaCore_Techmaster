package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();


    }

    public static ArrayList<Person> jsonToArrayList(Gson gson){
        ArrayList<Person> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("person.json");
            Type type = new TypeToken<ArrayList<Person>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public static void arrayToJson(Gson gson){
        Person[] arrayperson = new Person[3];
        arrayperson[0] = new Person("Hoa", "hoa@gmail.com", "0123456789");
        arrayperson[1] = new Person("Linh", "linh@gmail.com", "0123456789");
        arrayperson[2] = new Person("Quang", "quang@gmail.com", "0123456789");

//        String result = gson.toJson(arrayperson);
//        System.out.println(result);
        try {
            FileWriter fw = new FileWriter("data.json");
            JsonWriter writer = new JsonWriter(fw);
            writer.beginArray();
            for(Person p : arrayperson){
                writer.beginObject();
                writer.name("full_name").value(p.getFullName());
                writer.name("email").value(p.getEmail());
                writer.name("phone_number").value(p.getMobile());
                writer.endObject();
            }
            writer.endArray();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Person[] jsonToArray(Gson gson){
        Person[] arrPerson = null;

        try {
            FileReader reader = new FileReader("person.json");
            arrPerson = gson.fromJson(reader, Person[].class);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return arrPerson;
    }
    public static Person jsonToObject(Gson gson){
        String json = "{\"name\":\"Charmian Randlesome\"," +
                "\"email\":\"crandlesome0@github.io\"," +
                "\"mobile\":\"109-369-5881\"}";

        Person newPerson = gson.fromJson(json, Person.class);
        return newPerson;
    }

    public static String objectToJson(Gson gson){
        Person person = new Person("Linh", "linh@gmail.com", "0123456789");

        String result = gson.toJson(person);
        return result;
    }
}
