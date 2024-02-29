import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //AreaFinder af=new AreaFinder();
        AreaFinder.findArea(46);
        AreaFinder.findArea(456,67);
        //jvm binds this call to one matching definition - binding
        // jvm will look for function name - 5 matched
        // look for the no of arg - 3 methods
        // look for type of arg
    }
}
