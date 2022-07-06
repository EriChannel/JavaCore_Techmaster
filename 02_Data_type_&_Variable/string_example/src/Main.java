public class Main {
    public static void main(String[] args) {
        String s1 = "Java";

        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("ĐỘ dài chuỗi s1: " + s1.length());

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.indexOf("a"));

        System.out.println(s1.lastIndexOf("a"));

        System.out.println(s1.indexOf("z"));

        System.out.println(s1.charAt(0));

        System.out.println(s1.replace('a', 'e'));
    }
}