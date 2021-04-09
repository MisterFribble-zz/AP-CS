
public class Main {
  public static void main(String[] args) {
    Quadrilateral q1 = new Quadrilateral(1, 2, 3, 4);
    System.out.println("The perimeter of q1 = " + q1.getPerimeter());
    Rectangle r1 = new Rectangle(3, 4);
    System.out.println("The perimeter of r1 = " + r1.getPerimeter());
  }
}