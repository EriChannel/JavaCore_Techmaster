public class Person {
    public int id;
    public String name;
    public int age;
    //public String gender;
    public Gender gender;
    public String address;

//    public Person(){
//        System.out.println("Gọi constructor");
//    }
//
//    public Person(int ma, String ten, int tuoi, Gender gioiTinh, String diaChi){
//        id = ma;
//        name = ten;
//        age = tuoi;
//        gender = gioiTinh;
//        address = diaChi;
//    }


    public Person(int id, String name, int age, Gender gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " call method sleep()");
    }

    public void hobby(){
        System.out.println(name + " call method hobby()");
    }
}
