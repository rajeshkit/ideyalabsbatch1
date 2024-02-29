package abstraction;

public class ChennaiPassportOffice extends HeadPassportOffice{
    @Override
    public void applyPassport() {
        System.out.println("Offline");
    }

    @Override
    public void verification(String panCard) {
        System.out.println("pan card");
    }
}
