public class Student {
    private int id;
    private String name;

    private Gender gender;
    private String classroom;

    public Student(int id, String name, Gender gender, String classroom) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classroom = classroom;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
