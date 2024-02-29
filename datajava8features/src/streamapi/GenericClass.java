package streamapi;

public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void add(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass=new GenericClass<>();
        genericClass.add("Rajesh");
        GenericClass<Integer> genericClass1=new GenericClass<>();
        genericClass1.add(45678);
    }
}
