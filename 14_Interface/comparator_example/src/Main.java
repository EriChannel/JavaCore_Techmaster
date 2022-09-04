import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", 16, "USA"));
        list.add(new Person("Victor", 20, "Mexico"));
        list.add(new Person("Anna", 16, "Canada"));
        list.add(new Person("Chris", 22, "USA"));
        list.add(new Person("Joe", 23, "Canada"));

        print(list);

    }

    public static void print(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p.getName() + " - " + p.getAge()
                    + " - " + p.getAddress());
        }
    }
}