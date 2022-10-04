public class OuterClass {

    private int age;
    private static String address = "OuterClass";

    public class InnerClass{
        public void method(){
            age = 20;
            System.out.println("Tuổi: " + age);
            System.out.println("Phương thức method của lớp InnerClass");
        }

        public static void staticMethod(){
            address = "InnerClass";
            System.out.println("Phương thức staticMethod của lớp " + address);
        }
    }

    public static class StaticClass{
        public void method(){
            System.out.println("Phương thức method của lớp StaticClass");
        }

        public static void staticMethod(){
            address = "StaticClass";
            System.out.println("Phương thức statiCMethod của lớp " + address);
        }
    }
}
