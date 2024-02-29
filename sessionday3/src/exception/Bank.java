package exception;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args)
            throws InsufficentFundException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the bank account number");
        int accountNumber = s.nextInt();
        if(accountNumber<0){
            try {
                throw new InvalidAccountNumberException("check account number");
            } catch (InvalidAccountNumberException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Welcome account holder");
            int balance=2000;
            System.out.println("Enter the amount want to transfer");
            int amount = s.nextInt();
            if(amount>balance){
                throw new InsufficentFundException("balance is low");
            }
        }
    }
}
