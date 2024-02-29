package streamapi;

import java.util.Arrays;

interface Book<T>{
    public boolean orderBook(T t);
}
class Order  {

    public boolean buyBook() {
       return true;
    }
    public boolean buyBook(String f) {
        return f.isEmpty();
    }
}
public class Demo {
    public static void main(String[] args) {
        //   public boolean orderBook();
        Book book=(e)->{return true;};

        Book<Order> book2=Order::buyBook;





//        //**************************************************
//        Book book=e->System.out.println("java lamda"+e);
//        book.orderBook("Mastering in java");
    }
}
