import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(575);
        set.add(345);
        set.add(987);
        set.add(233);
        System.out.println(set);

        Customer c1=new Customer(567,"abc");
        Customer c2=new Customer();
        c2.setCustomerId(8566);
        c2.setCustomerName("aad");
        Customer c3=new Customer(986,"bde");

        Set<Customer> set1=new TreeSet(new CustomerNameComparator());
        set1.add(c1);
        set1.add(c2);
        set1.add(c3);
        for (Customer c: set1) {
            System.out.println(c.getCustomerId()+" "+c.getCustomerName() );
        }


    }
}
