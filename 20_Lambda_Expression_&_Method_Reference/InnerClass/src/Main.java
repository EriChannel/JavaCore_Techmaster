public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.method();
        OuterClass.InnerClass.staticMethod();


        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
        staticClass.method();
        OuterClass.StaticClass.staticMethod();
    }
}