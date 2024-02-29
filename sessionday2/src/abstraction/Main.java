package abstraction;

public class Main implements Phone,Mobile{
    @Override
    public void phoneMethod() {

    }
    @Override
    public void add() {

    }
    @Override
    public void mobileMethod() {

    }

    public static void main(String[] args) {
        Phone p=new Main();
        p.add();
        Mobile m=new Main();
        m.add();
    }
}
