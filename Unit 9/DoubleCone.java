public class DoubleCone extends Cone {
  // Second flavor
  private String flavor2;

  //Constructors
  public DoubleCone(String f, boolean w) {
    this(f, f, w);
  }

  public DoubleCone(String f1, String f2, boolean w) {
    super(f1, w);
    setFlavor(f1, f2);
  }

  // Mutators
  public void setFlavor(String f) {
    setFlavor(f, f);
  }

  public void setFlavor(String f1, String f2) {
    super.setFlavor(f1);
    flavor2 = f2;
  }

  // toString
  public String toString() {
    return "double " + super.toString() + " and " + flavor2;
  }
}
