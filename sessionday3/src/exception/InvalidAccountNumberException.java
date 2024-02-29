package exception;

import javax.management.RuntimeMBeanException;

public class InvalidAccountNumberException extends Exception {
    String msg;
    public InvalidAccountNumberException(String msg){
        super(msg);
        this.msg=msg;
    }
}
// new InvalidAccountNumberException("check account number");

