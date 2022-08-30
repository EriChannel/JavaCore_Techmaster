package test;

public class Main {
    public static void main(String[] args) {
        String name = "ryan";
        String newName = upperCaseFirstCharater(name);

        System.out.println(name);
        System.out.println(newName);

    }



    static String upperCaseFirstCharater(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}
