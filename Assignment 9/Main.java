import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //Uncomment to test the Account Class
    /*Account one = new Account("Rachel", "Smith", 5000.00);
    System.out.println(one.getBalance());
    System.out.println(one);


    //uncomment to test the Loan Class
    Loan two = new Loan("Rachel", "Smith", 5000.00, "Car", 0.04, 5);
    two.getPayment();
    System.out.println(two);

    //uncomment to test the Checking Class
    Checking three = new Checking("Smith", "Rachel", 5000);
    three.deposit(1000);
    three.withdraw(1500);
    System.out.println(three.getType());
    System.out.println(three);

    //Uncomment to test the Savings Class
    Savings four = new Savings("Smith", "Rachel", 5000, 0.04);
    System.out.println(four.getInterestEarned());
    System.out.println(four);*/


    //Uncomment to Test the Bank Class
    Checking a1 = new Checking("Jennifer", "Aniston", 5000);
    Savings a3 = new Savings("Robin", "Williams", 7000, 0.02);
    Checking a2 = new Checking("Gabriel", "Iglesias", 12000);
    Savings a4 = new Savings("Rock", "Chris", 5000, 0.03);
    Loan a5 = new Loan("America", "Ferrera", 5000,"Car", 0.03, 5);
    Loan a6 = new Loan("Steven", "Tyler", 500000, "House", 0.04, 30);

    ArrayList<Loan> loanList = new ArrayList<Loan>();
    loanList.add(a5);
    loanList.add(a6);

    ArrayList<Checking> accList = new ArrayList<Checking>();
    accList.add(a1);
    accList.add(a3);
    accList.add(a2);
    accList.add(a4);

    Bank jBank = new Bank(loanList, accList);
    System.out.println(jBank);
  }
}
