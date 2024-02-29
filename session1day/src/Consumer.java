public class Consumer {
    public void getBill(){
        EbBillCalculator eb=new EbBillCalculator();
        float billAmount=eb.calcaulateEBBill(200,1.5f,100);
        System.out.println(billAmount);
        String msg = eb.consumerInformation();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Consumer c1=new Consumer();
        c1.getBill();
    }

}
