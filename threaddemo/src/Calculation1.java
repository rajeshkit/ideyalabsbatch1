public class Calculation1 extends Thread{
    public Table table;

    public Calculation1(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
       table.printTable(100);
    }
}
