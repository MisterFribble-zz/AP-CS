public class SpecialityCoffee extends Coffee {
  // Fields
  private String flavor;

  // Constructors
  public SpecialityCoffee(String s, boolean sk, int sh, String t, String f) {
    super(s, sk, sh, t);
    flavor = f;
  }

  public SpecialityCoffee(String s, String t, String f) {
    this(s, false, 1, t, f);
  }

  public SpecialityCoffee() {
    this("small", false, 1, "latte", "vanilla");
  }

  // getPrice override
  public int getPrice() {
    if (getSize().equals("large") || getSize().equals("extra large")) {
      return super.getPrice() + 70;
    }
    return super.getPrice() + 50;
  }

  // toString
  public String toString() {
    return super.toString() + " with " + flavor;
  }
}
