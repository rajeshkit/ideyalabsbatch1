package abstraction;

public class PassportApplicant {
    public static void main(String[] args) {
        IHeadPassportOffice io=null;
        io=new PunePassportOffice();
        io=new MhPassportOffice();

    }
}
