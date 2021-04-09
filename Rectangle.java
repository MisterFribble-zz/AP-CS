public class Rectangle extends Quadrilateral {
  // Constructor
  public Rectangle(int a, int b) {
    super(a, b, a, b);
  }

  public int getPerimeter() {
    return 2 * (getSide1() + getSide2());
  }
}
