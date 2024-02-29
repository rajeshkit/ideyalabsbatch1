import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList();
        list.add(575);
        list.add(345);
        list.add(987);
        list.add(233);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Customer c1=new Customer(567,"abc");
        Customer c2=new Customer();
        c2.setCustomerId(8566);
        c2.setCustomerName("aad");
        Customer c3=new Customer(986,"bde");

        List<Customer> list1=new LinkedList();
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        System.out.println(list1);
        Collections.sort(list1,new CustomerIdComparator());
        System.out.println(list1);
        Collections.sort(list1,new CustomerNameComparator());
        System.out.println(list1);
    }
}
