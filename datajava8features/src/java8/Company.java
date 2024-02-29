package java8;

public interface Company {
    public float display(int a);
    default public void add(){
        System.out.println("Add");
    }
    public static int getData(){
        System.out.println("getDate");
        return 0;
    }
}
