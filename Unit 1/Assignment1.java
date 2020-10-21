/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(final String[] args) {

      final Scanner scan = new Scanner(System.in);

      // Take movie title as string
      System.out.println("Please enter the movie name");
      final String title = scan.nextLine();

      // Take runtime in minutes, convert to hr and min
      System.out.println("\nPlease enter the running time in minutes.");
      final int runTime = scan.nextInt();
      final int runHour = runTime / 60;
      final int runMin = runTime % 60;

      // Take user ratings as 3 integers
      System.out.println("\nPlease enter ratings from the movie review website.");
      final int rating1 = scan.nextInt();
      final int rating2 = scan.nextInt();
      final int rating3 = scan.nextInt();

      // Take focus group ratings as 2 doubles
      System.out.println("\nPlease enter ratings from the focus group.");
      final double focus1 = scan.nextDouble();
      final double focus2 = scan.nextDouble();
      System.out.println();

      // Take critic rating as 1 double
      System.out.println("\nPlease enter the average movie critic rating.");
      final double critic = scan.nextDouble();

      // Output Title and running time in hr/min
      System.out.println("\nTitle: " + title);
      System.out.println("Running time: " + runHour + "h" + runMin);

      // Calculate and display the averages of the ratings
      final double userAvg = ((double) rating1 + rating2 + rating3) / 3;
      System.out.println("Average website rating: " + userAvg);
      final double focusAvg = (focus1 + focus2) / 2;
      System.out.println("Average focus group rating: " + focusAvg);
      System.out.println("Average movie critic rating: " + critic);
      final int weightedAvg = (int) (Math.round(userAvg * 0.2 + focusAvg * 0.3 + critic * 0.5));
    System.out.println("Overall movie rating: " + weightedAvg);

    scan.close();
  }
}

