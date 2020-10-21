/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_Two{
  public static void main(String[] args){
  
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    //Print "Enter radius:\n> ", Take input radius, assign to double rad, create new circle
    System.out.print("Enter radius:\n> ");
    double rad = scan.nextDouble();
    Circle circle = new Circle(rad);

    //create new variable area and assign it to the area of circle, println "Area: #area#"
    double area = circle.getArea();
    System.out.println("Area: " + area);

    //double the radius, update circle, update area, print "Radius is being doubled..."
    circle.setRadius((circle.getRadius() * 2));
    area = circle.getArea();
    System.out.println("Radius is being doubled...");

    //print new area: "Area: #area#"
    System.out.println("Area: " + area);

    //Close scan
    scan.close();

  }
}