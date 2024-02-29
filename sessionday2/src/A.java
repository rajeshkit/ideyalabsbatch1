public class A {
    A(){
        System.out.println("Base class A no arg constructor");
    }
    A(String s){
        System.out.println("Base class A one arg constructor"+s);
    }
    int a=1000;
    void display(){
        System.out.println("display method is called");
    }
}
