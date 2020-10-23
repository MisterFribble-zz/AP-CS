import java.util.Scanner;

public class U3_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is the temperature?");
    double temp = scan.nextDouble();

    if (temp < 99) {
      System.out.println("WARNING");
    } else if (temp > 100) {
      System.out.println("WARNING");
    } else {
      System.out.println("Temperature is OK");
    }

    scan.close();
  }
}
