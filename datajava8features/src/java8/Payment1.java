package java8;

public interface Payment1 {
    default public void bankPayment(){
        System.out.println("Payment1");
    }
}
