import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Set<Integer> list=new HashSet();
        list.add(575);
        list.add(5768);
        list.add(576);
        list.add(98756);
        list.add(78);
        list.add(575);
        Map<Integer,String> map=new HashMap();
        map.put(434,"Chennai");
        map.put(876,"hyderabad");
        map.put(898,"telungana");
        map.put(233,"Bangalore");
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("**************");
        System.out.println(map.get(898));
        for (Map.Entry<Integer,String> e:map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        for (Integer key:map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
