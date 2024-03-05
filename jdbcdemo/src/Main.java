interface Ideyalabs{

}
public class Main implements  Ideyalabs{
    private Main(){
    }
    public static Main getMain(){
        return  new Main();
    }
}