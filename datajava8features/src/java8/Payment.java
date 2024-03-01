package java8;
@MyAnnotation(value = "", size = 0)
public interface Payment {
    int transaction();

    public static void upiPayment(){

    }
    default public void bankPayment(){
        System.out.println("payment ");
    }
}
