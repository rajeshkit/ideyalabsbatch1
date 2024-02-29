public class Bank extends Loan{
    public void displayBankInfo(){
        System.out.println("Bank information");
        System.out.println(loanId);
        System.out.println(loanType);
        System.out.println(loanAmount);
        displayLoanInformation();
    }

}
