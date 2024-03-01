package solid;

public class CardPayment implements Payment{

    @Override
    public void payment(String paymentMethod) {
        System.out.println("card payment");
    }
}
