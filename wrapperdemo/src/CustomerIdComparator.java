import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getCustomerId()>o2.getCustomerId()){
            return 565;
        }
        if(o1.getCustomerId()<o2.getCustomerId()){
            return -5678;
        }
        return 0;
    }
}
