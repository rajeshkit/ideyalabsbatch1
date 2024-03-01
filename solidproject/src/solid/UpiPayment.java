package solid;

public class UpiPayment implements Payment{
    @Override
    public void payment(String paymentMethod) {
        System.out.println("upi payment");
    }
}
