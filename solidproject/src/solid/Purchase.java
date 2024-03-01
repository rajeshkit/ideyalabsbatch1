package solid;

public class Purchase {
    public static void main(String[] args) {
        Fruit fruit=new Orange();
        System.out.println(fruit.getFruit());
        fruit=new Apple();
        System.out.println(fruit.getFruit());
    }
}
