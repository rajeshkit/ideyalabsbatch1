package hasainheritance;
public class Human1 {
    Heart heart;
    Human1(){

    }
    public Human1(Heart heart) {
        this.heart = heart;
    }
    public void isAlive(){
        boolean isBeat=heart.isHeartIsBeating();
        if(isBeat==true){
            System.out.println("alive");
        }
    }

    public static void main(String[] args) {
        Heart heart1=null;
        Human1 h=new Human1();
        h.isAlive();
        h=null;
    }
}
