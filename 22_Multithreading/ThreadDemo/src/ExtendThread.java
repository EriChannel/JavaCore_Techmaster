public class ExtendThread extends Thread {

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            //System.out.println(Thread.currentThread().getId());
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Kết thúc " + Thread.currentThread().getName());
    }
}
