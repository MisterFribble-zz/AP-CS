public class RightTriangle {
  // Fields
  private double base;
  private double height;
  
  // Constructors
  public RightTriangle() {
    setBase(1);
    setHeight(1);
  }

  public RightTriangle(double bs, double ht) {
    this();
    setBase(bs);
    setHeight(ht);
  }

  // Calculates the area of this right triangle as a double
  public double getArea() {
    return (base * height) / 2;
  }

  // Used to get the base of the right triangle as a double
  public double getBase() {
    return base;
  }

  // Used to get the height of the right triangle as a double
  public double getHeight() {
    return height;
  }

  // Calculates the length of the hypotenuse of the right triangle and returns it
  // as a double
  public double getHypotenuse() {
    return Math.sqrt((Math.pow(base, 2) + Math.pow(height, 2)));
  }

  // Calculates the perimeter of this right triangle as a double
  public double getPerimeter() {
    return getBase() + getHeight() + getHypotenuse();
  }

  // Sets the base of the right triangle to the specified length
  public void setBase(double bs) {
    if (bs > 0) {
      base = bs;
    }
  }

  // Sets the height of the right triangle to the specified length
  public void setHeight(double ht) {
    if (ht > 0) {
      height = ht;
    }
  }

  // Compares this right triangle to the other
  public boolean equals(RightTriangle other) {
    if(getBase() == other.getBase() && getHeight() == other.getHeight()) {
      return true;
    }
    return false;
  }

  // A String representation of this right triangle
  public String toString() {
    return "right triangle with base " + getBase() + ", height " + getHeight() + ", hypotenuse " + getHypotenuse();
  }
}
