import java.util.Scanner;

import edhesive.shapes.*;

public class U3_L7_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter length:");
    double side = scan.nextDouble();

    System.out.println("Enter 2 lengths:");
    double length = scan.nextDouble();
    double width = scan.nextDouble();

    Rectangle rect1 = new Rectangle(side);
    Rectangle rect2 = new Rectangle(length, width);

    if (rect1.equals(rect2)) {
      System.out.println("Congruent Rectangles");
    } else {
      System.out.println("Different Rectangles");
    }

    scan.close();
  }
}
