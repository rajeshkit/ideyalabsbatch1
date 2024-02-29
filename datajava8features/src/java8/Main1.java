package java8;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1  {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".aa.");
        Matcher matcher= p.matcher("Raaj57");
        System.out.println(matcher.matches());

        boolean pp = Pattern.matches(".aa.","Vaaj");
        System.out.println(pp);

//       Runnable r = ()-> System.out.println("hai");
//        Thread t1=new Thread(r);
//        t1.start();
//        Comparator<Integer> com=(o1, o2) -> o1-o2;
//        int result = com.compare(4556,5677);// comparator abstract method compare
//        System.out.println(result);
//
//       // Predicate<String> p; // boolean test(T t)
//        Predicate<Integer> predicate=e->e.intValue()>100;
//        boolean b=predicate.test(4776);
//        System.out.println(b);



    }





}
