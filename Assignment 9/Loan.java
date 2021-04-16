public class Loan extends Account {
  // Fields
  private String loanType;
  private double interestRate;
  private int yearsToPay;

  // Constructor
  public Loan(String fName, String lName, double bal, String lType, double intRate, int yToP) {
    super(fName, lName, bal);
    loanType = lType;
    interestRate = intRate;
    yearsToPay = yToP;
  }

  // getPayment method
  public double getPayment() {
    double r = interestRate / 12;
    int n = yearsToPay * 12;
    return (r * super.getBalance()) / (1 - Math.pow(1 + r, -n));
  }

  // toString method
  public String toString() {
    return super.toString() + "\n\t" + yearsToPay + " year " + loanType + " loan\n\tMonthly Payment: $" + getPayment();
  }
}
