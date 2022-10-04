
public class Person {

    @SingleValueAnnotation(1)
    private String name;
    @SingleValueAnnotation
    private int age;
    @MultiValueAnnotation(value1 = 1, value2 = "Eri", value3 = "Java")
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    @Deprecated
    public Person(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
