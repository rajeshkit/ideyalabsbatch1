package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        try {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int k=10/a;
            int[] a1={454,565,46,65};
            a1[2]=589;
            FileReader file=new FileReader("");
        } catch (FileNotFoundException | ArithmeticException | ArrayIndexOutOfBoundsException e) {

        }
    }
}
