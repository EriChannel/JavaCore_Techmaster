import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.print();

        Student student = service.getStudentById(5);
//        if(student != null){
//            System.out.println(student.getName());
//        }else {
//            System.out.println("Không tìm thấy học sinh");
//        }

        //System.out.println("Học sinh cần tìm: " + student.getName());

        Optional<Student> optional = Optional.ofNullable(student);
        if(optional.isPresent()){
            System.out.println("Học sinh cần tìm là: " + optional.get().getName());
        }else{
            System.out.println("Không tìm thấy học sinh");
        }

        optional.ifPresent(s -> System.out.println("Học sinh cần tìm là: "
                + optional.get().getName()));

        Optional<Student> optionalStudent = service.getStudentByID(5);


    }
}