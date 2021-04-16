public class Savings extends Checking {
  // Fields
  private double interestRate;

  // Constructor
  Savings(String fName, String lName, double bal, double intRate) {
    super(fName, lName, bal);
    type = false;
    interestRate = intRate;
  }

  // getInterestEarned method
  public double getInterestEarned() {
    return balance * interestRate;
  }

  // toString method
  public String toString() {
    return super.toString() + "\n\tInterest Earned: $" + getInterestEarned();
  }
}
