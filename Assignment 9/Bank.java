import java.util.ArrayList;

public class Bank {
  // Fields
  ArrayList<Loan> loans;
  ArrayList<Checking> checkOrSav;

  // Constructor
  public Bank(ArrayList<Loan>lns, ArrayList<Checking>cors) {
    loans = lns;
    checkOrSav = cors;
  }

  // toString method
  public String toString() {
    ArrayList<Checking> checking = new ArrayList<>();
    ArrayList<Checking> savings = new ArrayList<>();
    for (Checking account : checkOrSav) {
      if (account.getType()) {
        checking.add(account);
      } else {
        savings.add(account);
      }
    }

    String str = "CHECKING ACCOUNTS\n";
    for (Checking check : checking) {
      str += "\n" + check.toString();
    }
    str += "\n\n\nSAVINGS ACCOUNTS\n";
    for (Checking saving : savings) {
      str += "\n" + saving.toString();
    }
    str += "\n\n\nLOANS\n";
    for (Loan loan : loans) {
      str += "\n" + loan.toString();
    }
    
    return str;
  }
}
