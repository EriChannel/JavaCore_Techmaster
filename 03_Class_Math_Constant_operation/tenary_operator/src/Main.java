public class Main {
    public static void main(String[] args) {
       int x = 100;

        String result = (x % 2 == 0) ? x + " là số chẵn" : x + " là số lẻ";
        System.out.println(result);

        int exp = 1;

        int salary = exp > 3 ? 1000 : 500;
        System.out.println(salary);
    }
}