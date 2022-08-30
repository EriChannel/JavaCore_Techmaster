public class MyClass implements MyFunctionalInterface{
    @Override
    public void doSomething() {

    }

    @Override
    public void defaultMethod() {
        MyFunctionalInterface.super.defaultMethod();
    }
}
