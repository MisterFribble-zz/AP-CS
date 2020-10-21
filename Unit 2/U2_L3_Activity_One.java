import java.util.Scanner;
public class U2_L3_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scan.nextLine();
        int length = word.length();
        String first = word.substring(0, 1);
        String last = word.substring(length-1);
        System.out.println(first + last);
        scan.close();
    }
}
