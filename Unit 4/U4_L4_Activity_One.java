import java.util.Scanner;

public class U4_L4_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input string:");
    String str = scan.nextLine();
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
	    if(str.toUpperCase().substring(i, i + 2).equals("SH")) {
		    count++;
	    }
    }
    System.out.println("Contains \"sh\" " + count + " times.");
    scan.close();
  }
}
