public class HelloWorld {
    public static void main(String[] args){
        String a;
//        System.out.println("Hello World");
//        int sum=add(10,20);
        System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+" "+Long.MAX_VALUE);

    }

    public static int add(int a,int b){
        int total = a + b;// logic
       return total;
    }
}
