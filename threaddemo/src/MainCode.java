public class MainCode {
    public static void main(String[] args) {
        Table t=new Table();
        Calculation c1=new Calculation(t);
        Calculation1 c2=new Calculation1(t);
        c2.start();
        c1.start();
    }
}
