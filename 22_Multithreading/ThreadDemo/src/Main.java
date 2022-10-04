public class Main {
    public static void main(String[] args) {
        ExtendThread threadDemo = new ExtendThread();
        threadDemo.setName("Thread 1");
        threadDemo.start();
        try {
            threadDemo.join(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ExtendThread threadDemo2 = new ExtendThread();
        threadDemo2.setName("Thread 2");
        threadDemo2.start();
        try {
            threadDemo2.join(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ExtendThread threadDemo3 = new ExtendThread();
        threadDemo3.setName("Thread 3");
        threadDemo3.start();
        try {
            threadDemo3.join(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//        ImplementRunnable threadDemo = new ImplementRunnable();
//        Thread thread = new Thread(threadDemo);
//        thread.start();
    }
}