public class Main {
    public static void main(String[] args) {
        Person jane = new Person();
        jane.id = 1;
        jane.name = "Jane";
        jane.age = 20;
        jane.gender = Gender.FEMALE;
        jane.address = "Hà Nội";

        System.out.println(jane.id + " - " + jane.name + " - " + jane.age + " - " +
                jane.gender + " - " + jane.address);

        jane.sleep();
        jane.hobby();

        Person john = new Person();
        john.id = 2;
        john.name = "John";
        john.age = 30;
        john.gender = Gender.MALE;
        john.address = "TP Hồ Chí Minh";
        System.out.println(john.id + " - " + john.name + " - " + john.age + " - " +
                john.gender + " - " + john.address);

        john.sleep();
        john.hobby();

        Person anna = new Person(3, "Anna", 25, Gender.FEMALE, "Hà Nội");
        System.out.println(anna.id + " - " + anna.name + " - " + anna.age + " - " +
                anna.gender + " - " + anna.address);
    }
}