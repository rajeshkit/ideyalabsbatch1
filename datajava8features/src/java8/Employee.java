package java8;
@MyAnnotation(value = "Tv", size = 65)
public class Employee implements Runnable{

   protected int id;
   protected  String name;
    public Employee(){

    }

    @Override
    public void run() {

    }

    public int displayEmployeeId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Employee ee=new Employee();
        Thread t=new Thread(ee);
        t.start();
    }
}
