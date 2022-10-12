public class Student extends Person{
    public double GPA;

    public Student(String name, int age, String address, double GPA) {
        super(name, age, address); //Tham chiếu tới constructor của lớp Person
        this.GPA = GPA;
    }

    public void printParent(){
        System.out.println(super.name); //Tham chiếu đến biến của lớp Person
    }

    @Override
    public void print() {
        super.print(); //Tham chiếu đến phương thức của lớp Person
        System.out.println("GPA: " +GPA);
    }
}
