import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Primitive type reference type
        int userId=4546;
        Integer i=Integer.valueOf(userId); //boxing

        float cgpa=354.323f;
        Float f = cgpa; // auto - boxing
       // reference type to a primitive
        int k = i.intValue();//unboxing
        float f1=cgpa; //auto - unboxing

        // string to a reference type
        String s1="45656";
        Integer i1 = Integer.valueOf(s1);
        //String to a primitive type
        int k1=Integer.parseInt(s1);
        Iterable it;
        Collection col;
        List list;
        Set set;
        Queue q;
        LinkedList list1;
    }
}