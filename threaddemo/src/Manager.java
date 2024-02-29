public class Manager implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
            Manager manager=new Manager();
            Thread t1=new Thread(manager);
            t1.start();
            Thread t2=new Thread(manager);
            t2.start();
    }
}
