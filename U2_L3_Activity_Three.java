import java.util.Scanner;

public class U2_L3_Activity_Three {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first word:\n-");
        String raw1 = scan.nextLine();
        System.out.print("Enter second word:\n-");
        String raw2 = scan.nextLine();
        
        String word1 = raw1.toLowerCase();
        String word2 = raw2.toLowerCase();

        System.out.println("Result: " + word2.compareTo(word1));

        scan.close();
    }
}
