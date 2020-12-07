import java.util.Scanner;

public class U4_L1_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Input a word:");
    String word = scan.nextLine();
    
    int i = 0;
    while (i < word.length()) {
      System.out.print(word.substring(i, i + 1));
      i += 2;
    }
  }
}
