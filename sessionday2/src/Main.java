
public class Main {

    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        for (int i = 0; i < 10; i++) {
            System.out.println(""+i);
            if(i==5){
               continue;
            }

        }
        ArrayManuplation arrayManuplation=new ArrayManuplation();
        arrayManuplation.test();

        System.out.println("Line6");

        System.out.println("Line7");
        System.out.println("Line8");
    }
}