package hasainheritance;

public class Human {
    Heart heart;
    Human() {
     heart=new Heart();
    }
    public void isAlive(){
        boolean isBeat=heart.isHeartIsBeating();
        if(isBeat==true){
            System.out.println("alive");
        }
    }

    public static void main(String[] args) {
        Human h=new Human();
        h.isAlive();
        h=null;
    }
}
