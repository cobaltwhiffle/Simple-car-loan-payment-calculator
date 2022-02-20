//Calculating the monthly payment when taking out a car loan

public class CarLoan {
  int carLoan = 10000;
  int loanLength = 3;
  //interest rate of 5%
  int interestRate = 5;
  int downPayment = 2000;

  public void invalidLoan(int longLoan, int intRate){
    loanLength = longLoan;
    interestRate = intRate;

    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Buyer can not take out car loan");
    }
    else if (downPayment >= carLoan){
      System.out.println("Buyer's amount is sufficient and a loan is not required");
    } else { 
      System.out.println("Your monthly payment is: ");

      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      
      System.out.println(monthlyPayment + "€ does that sound good?");

    }
    }

	public static void main(String[] args) {
    CarLoan charlie = new CarLoan();
    charlie.invalidLoan(3, 5);

    CarLoan levi = new CarLoan();
    levi.invalidLoan(0, 3);

	

	}
}
