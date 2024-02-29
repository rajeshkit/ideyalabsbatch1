package java8;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main implements Payment,Payment1{
    public static void main(String[] args) {
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

    @Override
    public void bankPayment() {
        Payment.super.bankPayment();
    }


}
