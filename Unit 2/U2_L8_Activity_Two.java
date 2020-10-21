import java.util.Scanner;

public class U2_L8_Activity_Two {
  public static void main(String[] args) {
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter distance east:");
    double a = scan.nextDouble();

    System.out.println("Enter distance north:");
    double b = scan.nextDouble();

    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("Distance between points: " + c);
  }
}
