package java8;

import java.util.concurrent.*;

public class Demo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Runnable runnable1=()->{System.out.println("Hello 1");};
       Callable<String> callable=()->{
           Thread.sleep(10000);
           return "callable welcome";
       };

//        Runnable runnable2=()->{
//            System.out.println("Hello 2");
//        };
//        Runnable runnable3=()->{
//            System.out.println("Hello 3");
//        };
//        Runnable runnable4=()->{
//            System.out.println("Hello 4");
//        };
       ExecutorService executorService=Executors.newFixedThreadPool(4);
       executorService.submit(runnable1);
       Future<String> future=executorService.submit(callable);
        System.out.println(future.get());
        System.out.println("ideyalabs1");
        System.out.println("ideyalabs2");
        System.out.println("ideyalabs3");

        System.out.println("ideyalabs4");

        executorService.shutdownNow();
    }
}
