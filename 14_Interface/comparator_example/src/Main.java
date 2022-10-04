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

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(list, comparator);

        System.out.println("Danh sách sau khi sắp xếp: ");
        print(list);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge() - o2.getAge();
                if(result == 0 ){
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });

        System.out.println("Danh sách sắp xếp theo tên và tuổi: ");
        print(list);

    }

    public static void print(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p.getName() + " - " + p.getAge()
                    + " - " + p.getAddress());
        }
    }
}