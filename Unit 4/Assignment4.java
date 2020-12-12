import java.util.Scanner;

public class Assignment4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Type the message to be shortened");
    String str = scan.nextLine().toLowerCase();

    //Algorithm 1
    String newStr1 = "";
    int vowelCount = 0;
    int repeatCount = 0;

    for (int i = 0; i < str.length(); i++) {
      if (i == 0 || str.substring(i - 1, i).equals(" ")) {
        newStr1 += str.substring(i, i + 1);
      } else {
        if (str.substring(i, i + 1).matches("a|e|i|o|u")) {
          vowelCount++;
        } else if (i + 2 <= str.length() && str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
          repeatCount++;
        } else {
          newStr1 += str.substring(i, i + 1);
        }
      }
    }

    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels revomed: " + vowelCount);
    System.out.println("Repeats removed: " + repeatCount);
    System.out.println("Algorithm 1 message: " + newStr1);
    System.out.println("Algorithm 1 characters saved: " + (str.length() - newStr1.length()));


    // Algorithm 2
    String newStr2 = "";
    boolean unique = true;
    int counter = 0;
    int uniqueCount = 0;

    for (int i = 0; i < str.length(); i++) {
      if (!str.substring(i, i + 1).equals(" ")) {
        for (int j = 0; j < i; j++) {
          if (!str.substring(j, j + 1).equals(" ")) {
            if (str.substring(j, j + 1).equals(str.substring(i, i + 1))) {
              unique = false;
            }
          }
        }

        if (unique) {
          uniqueCount++;
          for (int k = 0; k < str.length(); k++) {
            if (str.substring(i, i + 1).equals(str.substring(k, k + 1))) {
              counter++;
            }
          }
          newStr2 += counter + str.substring(i, i + 1);
        }

        unique = true;
        counter = 0;
      }
    }

    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found: " + uniqueCount);
    System.out.println("Algorithm 2 message: " + newStr2);
    System.out.println("Algorithm 2 characters saved: " + (str.length() - newStr2.length()));


    scan.close();
  }
}
