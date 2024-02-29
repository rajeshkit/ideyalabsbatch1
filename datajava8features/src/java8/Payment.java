package java8;
@FunctionalInterface
public interface Payment {
    int transaction();

    public static void upiPayment(){

    }
    default public void bankPayment(){
        System.out.println("payment ");
    }
}
