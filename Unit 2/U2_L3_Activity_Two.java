import java.util.Scanner;

public class U2_L3_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = scan.nextLine();
        String segment = word.substring(1, word.length()-1);

        System.out.println(segment);
        scan.close();
    }
}
