import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> list=new HashSet(); //has-a inheritance
        list.add(575);
        list.add(5768);
        list.add(576);
        list.add(98756);
        list.add(78);
        list.add(575);
        Customer c1=new Customer();
        Customer c2=new Customer();
        Customer c3=new Customer();
        Customer c4=new Customer();
        Set<Customer> set=new HashSet();
        set.add(c1);
        set.add(c4);
        set.add(c3);
        set.add(c2);






        System.out.println(list);


    }
}
