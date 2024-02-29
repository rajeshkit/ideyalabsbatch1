import java.util.Scanner;

public class Buyer {
    public void getLaptopPrice(){
        LaptopStore lap=new LaptopStore();
        float finalPrice = lap.getQuote(4,16,500);//passing as a values
        System.out.println(finalPrice);

        //laptop keyborad -> has to be brought inside a variable
        Scanner s=new Scanner(System.in);//has-a
        s.nextLine();
        Laptop laptop=new Laptop(4,16,500);
        float finalPrice1=lap.getQuote(laptop);
        System.out.println(finalPrice1);
    }

    public static void main(String[] args) {
        Buyer buyer=new Buyer();
        buyer.getLaptopPrice();
    }
}
