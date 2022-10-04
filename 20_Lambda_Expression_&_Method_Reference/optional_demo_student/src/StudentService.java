import java.util.ArrayList;
import java.util.Optional;

public class StudentService {

    static ArrayList<Student> listStudent = new ArrayList<>();
    static {
        listStudent.add(new Student(1,"Nguyễn văn A", Gender.MALE, "10A"));
        listStudent.add(new Student(2,"Nguyễn Thị B", Gender.FEMALE, "10B"));
        listStudent.add(new Student(3,"Trần Thị C", Gender.FEMALE, "10B"));
        listStudent.add(new Student(4,"Hoàng Văn D", Gender.MALE, "10B"));
        listStudent.add(new Student(5,"Nguyễn Văn E", Gender.MALE, "10A"));
        listStudent.add(new Student(6,"Lê Thị F", Gender.FEMALE, "10A"));
    }

    public void print(){
        listStudent.forEach(s -> System.out.println(s.getId() + " - " +
                s.getName() + " - " + s.getGender() + " - " + s.getClassroom()));
    }

    public Student getStudentById(int id){
        for(Student s : listStudent){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public Optional<Student> getStudentByID(int id){
        for(Student s : listStudent){
            if(s.getId() == id){
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }
}
