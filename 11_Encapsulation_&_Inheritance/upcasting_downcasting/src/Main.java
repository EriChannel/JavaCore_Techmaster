public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Person person1 = student;  //kiểu chuyển đổi không tường minh
        Person person2 = (Person) student; // Kiểu chuyển đổi tường minh

        student.print();
        student.gpa();

        person1.print();
        person2.print();

//        person1.gpa();
//        person2.gpa();

        Person person = new Student(); //upcasting
        Student student1 = (Student) person;
        student1.print();
        student1.gpa();


    }
}