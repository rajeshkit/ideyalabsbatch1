import java.util.Date;

public class Customer {
    int customerId;//instance member variable
    static String customerName;//static member
    public static void applyLoan(){//member function
        int total; //local variable
    }
    public void editProfile(){//member function
        System.out.println(customerId);
    }

    public static void main(String[] args) {
        Customer c1=new Customer();//20202020
        c1.customerId=465;
     //   System.out.println(customerId);
        Customer c2 = new Customer();//40404040
        c2.customerId=466;
        System.out.println(c1.customerId);
    }

}
