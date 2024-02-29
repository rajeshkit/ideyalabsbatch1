package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> evenList=new ArrayList<>();
        List<Integer> list= Arrays.asList(466,2767,3434,989,11,232,345,2346,89,68,77);
        for (Integer e:list) {
            if(e%2==0){
                evenList.add(e);
            }
        }
        Map<Integer,Long> map = list.stream().map(e->e*e).filter(e->e%2==0).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        map.forEach((key,value)-> System.out.println(key+" "+value));

        list.stream().map(e->e*e).filter(e->e%2==0).forEach(System.out::println);




    }
}
