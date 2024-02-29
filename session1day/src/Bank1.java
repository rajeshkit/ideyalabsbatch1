public class Bank1 {
    public void displayBankInfo(){
        Loan loan=new Loan();// Has-a Inheritance
        System.out.println("Bank information");
        System.out.println(loan.loanId);
        System.out.println(loan.loanType);
        System.out.println(loan.loanAmount);
        loan.displayLoanInformation();
    }

}
