public class Student extends Person{
    private float practicePoint;
    private float theoryPoint;

    public Student(String name, int age, String address, float practicePoint, float theoryPoint) {
        super(name, age, address);
        this.practicePoint = practicePoint;
        this.theoryPoint = theoryPoint;
    }

    public Student() {
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    public float getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(float theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public float gpa(){
        return (theoryPoint + practicePoint);
    }
}
