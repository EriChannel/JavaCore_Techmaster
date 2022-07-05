public class Main {
    public static void main(String[] args) {
//        int age = 25;
//        Integer i = Integer.valueOf(age);

        //Boxing
        int a = 500;
        Integer i = new Integer(a); //Từ phiên bản Java 9 cách này đã bị hạn chế sử dụng
        //Autoboxing
        Integer j = a;
        Float f = 4.5f;
        Double d = 5d;
        Character ch = 'a';
        Boolean b = true;

        //Unboxing
        int i1 = i.intValue();
        int j1 = j.intValue();
        float f1 = f.floatValue();
        double d1 = d.doubleValue();
        char ch1 = ch.charValue();
        boolean b1 = b.booleanValue();

        //Hoặc chỉ cần
        int i2 = i;
        int j2 = j;
        float f2 = f;
        double d2 = d;
        char ch2 = ch;
        boolean b2 = b;
    }
}