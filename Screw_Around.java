/**
 * Screw_Around
 */
import java.util.Scanner;

public class Screw_Around {
    public static void main(String[] args) {
        // Instantiate and initialize new Scanner scan
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a test grade:");
        int grade = scan.nextInt();

        if (grade >= 60) {
            System.out.println("You passed!");
        }
    }
}