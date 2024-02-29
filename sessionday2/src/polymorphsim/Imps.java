package polymorphsim;

import java.util.Scanner;

public class Imps extends Payment{
    public void billPayment(){//overriding method
        System.out.println("Online Banking");
    }
    public void display(){

    }
    public static void main(String[] args) {
            Payment p=new Imps();// method overridding
            p.billPayment();

    }
}
