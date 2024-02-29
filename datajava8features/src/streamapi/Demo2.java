package streamapi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
            //boolean test(T t);

        Predicate<String> predicate11=(String e)->{return e.isEmpty();};
        Predicate<String> predicate111=String::isEmpty;

        Predicate<String> predicate=(String e)->{return e.equals("rajesh");};
        System.out.println(predicate.test("ideyalabs"));
        String s=new String("Rajesh");
        Predicate<String> predicate2=s::equals;
        predicate2.test("rajesh");




    }
}
