public class Consumer extends Thread{
    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getState());

        System.out.println("Hello");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        Consumer c=new Consumer();
        c.setDaemon(true);
        c.setName("t-0");
       // System.out.println(c.getState());
        c.start(); //internally calls run method
       // c.join();
       // System.out.println(c.getState());
        Consumer c1=new Consumer();

        c1.setName("t-1");
        c1.setPriority(MAX_PRIORITY);
        c1.start(); //internally calls run method
        Consumer c2=new Consumer();
        c2.setName("t-2");
        c2.start(); //internally calls run method

    }
}
