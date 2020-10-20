import java.util.Scanner;

public class U2_L1_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pwd = "letmein";
        System.out.println("Default password is " + pwd + "\nType a new password");
        pwd = scan.nextLine();
        System.out.println("The new password is " + pwd);
        scan.close();
    }
}
