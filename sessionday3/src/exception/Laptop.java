package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Laptop {
    int number;
    public void addTwoNumbers() throws ArithmeticException, FileNotFoundException {
        sum();// exception
    }
    public void sum() throws ArithmeticException, FileNotFoundException {
        // int k=10/0;
        // int k=10/0;
        FileReader fr=new FileReader("");
    }
}
