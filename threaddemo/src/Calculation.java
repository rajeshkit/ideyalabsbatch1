public class Calculation extends Thread{
    public Table table; // has - a relationship

    public Calculation(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
       table.printTable(2);
    }
}
