public class B extends A{
    int bb;
    B(){
       this(34,57);
       bb=10;
       System.out.println("child class B no arg constructor");

    }
    B(int a){
        bb=a;
        System.out.println("child class B one arg constructor"+a);

    }
    B(int a,int b){
        bb=a;
        System.out.println("child class B one arg constructor"+a);

    }
    public int b=6000;
    public void show(){
        System.out.println(b);
       // System.out.println(a);
      //  display();

    }

    public static void main(String[] args) {
        B b=new B();
    }
}
