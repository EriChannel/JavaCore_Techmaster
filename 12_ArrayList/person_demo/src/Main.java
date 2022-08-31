import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonService service = new PersonService();
        service.print();

//        System.out.println("Tìm theo tên: ");
//        service.findByName("A");
//
//        System.out.println("Danh sách những người đủ tuổi bầu cử: ");
//        service.findByAge(18);
        Person newPerson = new Person("Trần Thị G", 21, "Hà Giang");
        if(service.addNewPerson(newPerson)){
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Thất bại");
        }

        service.print();
        System.out.println("\n---------------------------\n");

        service.updateAge(newPerson, 22);
        System.out.println("Danh sách sau khi cập nhật: ");
        service.print();
        System.out.println("\n---------------------------\n");
        if(service.deletePerson(newPerson)){
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Thất bại");
        }

        System.out.println("Danh sách sau khi xóa: ");
        service.print();

    }
}