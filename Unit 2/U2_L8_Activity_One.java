import java.util.Scanner;

public class U2_L8_Activity_One {
  public static void main(String[] args) {
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);
    int min = 1;
    
    System.out.println("Enter a positive integer:");
    int range = scan.nextInt() + 1;

    int one = (int)(Math.random() * range + min);
    int two = (int)(Math.random() * range + min);
    int three = (int)(Math.random() * range + min);
    int four = (int)(Math.random() * range + min);
    int five = (int)(Math.random() * range + min);
    int six = (int)(Math.random() * range + min);
    int seven = (int)(Math.random() * range + min);
    int eight = (int)(Math.random() * range + min);
    int nine = (int)(Math.random() * range + min);
    int ten = (int)(Math.random() * range + min);

    System.out.println(one + "\n" + two + "\n" + three + "\n" + four + "\n" + five + "\n" + six + "\n" + seven + "\n" + eight + "\n" + nine + "\n" + ten);
    
    scan.close();
  }
}
