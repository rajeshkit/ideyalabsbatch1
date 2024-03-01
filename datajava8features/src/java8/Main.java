package java8;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
@MyAnnotation(value = "ddd",size = 567)
public class Main implements Payment{
    @MyAnnotation(value = "56789",size = 79)
    int total;
    public static void main(@MyAnnotation(value = "fgfg",size=577)  String[] args) {
        Runnable r;
        Comparable com;
        Comparator c;
        Callable c1;
        Predicate<String> p; // boolean test(T t)
        Supplier ss; //   T get()
        Consumer cc; //  void accept(T t)
        Function f; // R apply(T t)
        Payment.upiPayment();
        Main m=new Main();
        m.bankPayment();

    }


    @Override
    public int transaction() {

        return 0;
    }



}
