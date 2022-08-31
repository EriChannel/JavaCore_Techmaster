import java.util.ArrayList;

public class PersonService {
    static ArrayList<Person> listPerson;

    static {
        listPerson = new ArrayList<>();
        listPerson.add(new Person("Nguyễn Văn A", 15, "Hà Nội"));
        listPerson.add(new Person("Hoàng Văn B", 18, "Bắc Ninh"));
        listPerson.add(new Person("Nguyễn Thị A", 20, "Tuyên Quang"));
        listPerson.add(new Person("Nguyễn Thị C", 16, "Bắc Giang"));
        listPerson.add(new Person("Trần Văn D", 21, "Quảng Ninh"));
        listPerson.add(new Person("Hoàng Văn A", 19, "Hà Nội"));
        listPerson.add(new Person("Trần Thị E", 21, "Bắc Giang"));
        listPerson.add(new Person("Lê Văn G", 22, "Quảng Ninh"));
    }

    public void print(){
        for (Person p : listPerson){
            System.out.println(p);
        }
    }

    public void findByName(String fName){
        for(Person p : listPerson){
            if(p.getName().contains(fName)){
                System.out.println(p);
            }
        }
    }

    public void findByAge(int fAge){
        for(Person p : listPerson){
            if(p.getAge() >= fAge){
                System.out.println(p);
            }
        }
    }

    public boolean addNewPerson(Person p){
        return listPerson.add(p);
    }

    public void updateAge(Person p, int newAge){
        p.setAge(newAge);
    }

    public boolean deletePerson(Person p){
        return listPerson.remove(p);
    }
}
