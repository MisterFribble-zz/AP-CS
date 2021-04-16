public class Account {
  // Fields
  private String firstName;
  private String lastName;
  protected double balance;
  private static int counter;
  private int accountNumber;

  // Constructor
  public Account(String fName, String lName, double bal) {
    firstName = fName;
    lastName = lName;
    balance = bal;
    counter++;
    accountNumber = counter;
  }

  // Accessor method
  public double getBalance() {
    return balance;
  }

  // toString method
  public String toString() {
    return lastName + ", " + firstName + "\n\tAccount Number: " + accountNumber + "\n\tBalance: $" + balance;
  }
}
