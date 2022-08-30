public class Main {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Ngọc";
//
//        System.out.println(student.name);
        student.setName("Linh");
        student.setAge(20);

        System.out.println(student.getName() + " - " +student.getAge());
    }
}