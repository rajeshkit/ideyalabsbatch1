import java.util.Scanner;

public class Passenger {
    public static void main(String[] args) {
        Train train=new Train();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the train details");
        System.out.println("Enter the train Id");
        train.setTrainId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the train name");
        train.setTrainName(sc.nextLine());
        System.out.println("Enter the train source");
        train.setSource(sc.nextLine());
        System.out.println("Enter the train Destination");
        train.setDestination(sc.nextLine());
        Irctc irctc=new Irctc();
        irctc.getTrainDetails(train);

    }
}
