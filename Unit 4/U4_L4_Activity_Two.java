import java.util.Scanner;

public class U4_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter String:");
    String str = scan.nextLine().toLowerCase();

    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (!(str.substring(i, i + 1).equals("a") || 
          str.substring(i, i + 1).equals("e") || 
          str.substring(i, i + 1).equals("i") || 
          str.substring(i, i + 1).equals("o") || 
          str.substring(i, i + 1).equals("u"))) 
      {
		    newStr += str.substring(i, i + 1);
	    }
    }

    System.out.println(newStr);
    
    scan.close();
  }
}
