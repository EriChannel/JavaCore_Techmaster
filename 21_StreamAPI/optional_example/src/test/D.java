package test;

public class D implements InterfaceB, InterfaceC {
    @Override
    public void foo(String s) {
        System.out.println(s);
    }
}
