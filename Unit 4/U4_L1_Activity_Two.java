import java.util.Scanner;

public class U4_L1_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    int c = 0;
    double sum = 0;
    double avg = 0;

    System.out.println("Enter the Scores:");

    while (n != -1) {
      sum += n;
      c++;
      n = scan.nextInt();
    }

    avg = sum / (c - 1);

    System.out.println("The average is: " + avg);

    scan.close();
  }
}
