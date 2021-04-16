public class Checking extends Account {
  // Fields
  protected boolean type;

  // Constructor
  public Checking(String fName, String lName, double bal) {
    super(fName, lName, bal);
    type = true;
  }

  // deposit method
  public void deposit(double amount) {
    balance += amount;
  }

  // withdraw method
  public void withdraw(double amount) {
    balance -= amount;
  }

  // getType method
  public boolean getType() {
    return type;
  }

  // toString method
  public String toString() {
    if (type) {
      return super.toString() + "\n\tChecking Account";
    }
    return super.toString() + "\n\tSavings Account";
  }
}
