package polymorphsim;

public class NEFT extends Payment{
    public void billPayment(){
        System.out.println("Online Banking");
    }
    public static void main(String[] args) {
        Payment p=new NEFT();
        p.billPayment();
        p=new Imps();
        p.billPayment();
    }
}
