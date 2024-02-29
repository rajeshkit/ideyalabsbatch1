public class Trainee {
    int traineeId;
    public Trainee(){
        System.out.println("constructor");
    }
    public Trainee(int traineeId){
        this.traineeId=traineeId;
        System.out.println("one arg constructor");
    }
    public void display(){

    }
    public static void main(String[] args) {
        Trainee t1=new Trainee(4567); // one arg constructor
        Trainee t2=new Trainee();// no arg constructor
    }
}
