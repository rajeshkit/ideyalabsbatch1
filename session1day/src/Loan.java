public class Loan {
    int loanId;
    String loanType;
    float loanAmount;
    int emi;
    public void displayLoanInformation(){
        System.out.println(loanId);
        System.out.println(loanType);
        System.out.println(loanAmount+" "+emi);
    }
}
