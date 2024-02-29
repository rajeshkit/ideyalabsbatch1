public class EbBillCalculator {
    public float calcaulateEBBill(int noUnitsConsumedPerMonth,float pricePerUnit,int charges){
       float totalBill = noUnitsConsumedPerMonth*pricePerUnit+charges;
       return totalBill;
    }
    public String consumerInformation(){
        return "consumer profile";
    }
}
