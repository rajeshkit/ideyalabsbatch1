package nosolid;

public class OpenClosedNonSolid {
    public void payment(String paymentMethod){
        if(paymentMethod.equals("Upi")){
            System.out.println("upi logic");
        }
        if(paymentMethod.equals("Card")){
            System.out.println("card");
        }

    }
}
