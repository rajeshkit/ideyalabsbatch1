package exception;

public class InsufficentFundException extends Exception{
    String msg;
    InsufficentFundException(String msg){
        super(msg);
        this.msg=msg;
    }
}
