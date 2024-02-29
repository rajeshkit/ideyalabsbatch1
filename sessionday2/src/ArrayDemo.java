import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] a=new int[]{467,4676,356,768,46};
        Integer[] a1=new Integer[5];
        String[] str=new String[5];
        //--------------------
        int[] aa={34,56,34,56,2,6};
        //Trainee[] traineesList={t1,t2,t3,t4,t5};
        //-------------------------------------
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of trainees");
        int noOfTrainees=s.nextInt();
        Trainee[] trainees=new Trainee[4];
        for (int i = 0; i < noOfTrainees; i++) {
            System.out.println("Enter the trainee details");
            System.out.println("Enter the trainee Id");
            int tId = s.nextInt();
            s.nextLine();
            System.out.println("Enter the trainee name");
            String tName = s.nextLine();
            System.out.println("Enter the trainee email ID:");
            String tEmail = s.nextLine();
            Trainee t1 = new Trainee(tId, tName, tEmail);
            trainees[i] = t1;
        }
    }
}
