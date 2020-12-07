import java.util.Scanner;

public class U4_L4_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Strings:");
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();

    String newStr = "";
    if (str1.length() == str2.length()) {
      for (int i = 0; i < str1.length(); i++) {
        newStr += str1.substring(i, i +1) + str2.substring(i, i + 1);
      }
      System.out.println(newStr);
    } else {
      System.out.println("error");
    }
    
    scan.close();
  }
}
