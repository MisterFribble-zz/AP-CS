import java.util.Scanner;

public class U2_L3_Activity_Four {
    public static void main(String[] args) {
        //Open scanner
        Scanner scan = new Scanner(System.in);

        //Request input sentence
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        
        //Isolate first word
        int spaceIndex = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, spaceIndex);

        //Print word length
        System.out.println(firstWord.length());

        //Close scanner
        scan.close();
    }
}
