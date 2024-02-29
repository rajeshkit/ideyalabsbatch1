public class StringDemo {
    public static void main(String[] args) {
        String s1="ideyalabs"; //202020 string literal
        String s3="ideyalabs";
        String s4=new String("rajesh");
        s4=s4+"dfg";
        String s5=new String("rajesh").intern();

        String s6=new String("ideyalabs");
        String s2="hyderabad";
        System.out.println(s1);//ideyalabs
    }
}
