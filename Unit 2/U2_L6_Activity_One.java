/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in); //Instantiate and Initialize new Scanner scan

    //Take input # of sides and length and assign to variables num and len
    System.out.print("Enter number of sides:\n> ");
    int num = scan.nextInt();
    System.out.print("Enter side length:\n> ");
    double len = scan.nextDouble();

    //Create new RegularPolygon polygon using the variables num and len
    RegularPolygon polygon = new RegularPolygon(num, len);

    //get perimeter and area of polygon and assign to variables
    double perimeter = polygon.getPerimeter();
    double area = polygon.getArea();

    //print the output: "A regular ___ with side length ## has perimeter ## and area ##"
    System.out.println("A " + polygon + " has perimeter " + perimeter + " and area " + area);

    //close Scanner scan
    scan.close();
  
  }
}