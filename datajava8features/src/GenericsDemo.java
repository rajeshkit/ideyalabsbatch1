import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericsDemo {

    public static <T> void printListCollection(List<? super Number> list){
        for (Object i:list) {
            System.out.println(i);
        }
    }
    public static <T,U> U[] printData(T[] intArray, U[] intArray1){
        for (T i:intArray) {

        }
        return intArray1;
    }

    public static void main(String[] args) {
        GenericsDemo.printData(new Integer[]{56,3467,467,5467,345,87634},new String[]{} );

    }

}
