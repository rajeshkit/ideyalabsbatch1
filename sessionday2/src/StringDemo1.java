public class StringDemo1 {
    public static void main(String[] args) {
        String s2=new String("ideyalabs");
        System.out.println(s2.hashCode());
        String s1="ideyalabs";
        System.out.println(s1.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
