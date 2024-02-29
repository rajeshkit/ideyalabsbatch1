package abstraction;

public class HyderabhadPassportOffice extends HeadPassportOffice{

    @Override
    public void applyPassport() {
        System.out.println("online");
    }

    @Override
    public void verification(String aadharCard) {
        System.out.println("aadhar card");
    }
}
