public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x % y = " + (x % y));

        int i = 1;
        int j;

        j = i++;
        System.out.println(i +" - " + j);

        i = 1;
        j = ++i;
        System.out.println(i + " - " + j);

    }
}