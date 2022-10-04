import java.util.Date;

@MarkerAnnotation
public class Main {

    @MarkerAnnotation
    public static void main(String[] args) {
        Date date = new Date(2022, 10, 1);

        Person p = new Person("Ngọc");
        p.setAge(19);

    }
}