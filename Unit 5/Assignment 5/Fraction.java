public class Fraction {
  // Fields
  private int numerator;
  private int denominator;
  private static int num;

  // Constructors
  public Fraction() {
    numerator = 1;
    denominator = 1;
    num++;
  }

  public Fraction(int n, int d) {
    this();
    setNumerator(n);
    setDenominator(d);
  }

  // Accessors
  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public static int getNumFractions() {
    return num;
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  public String mixedNumber() {
    int whole = numerator / denominator;
    int remainder = numerator % denominator;
    if(whole == 0) {
      return numerator + "/" + denominator;
    }
    if(remainder == 0) {
      return "" + (numerator / denominator);
    }
    return whole + " " + remainder + "/" + denominator;
  }

  // Mutators
  public void setNumerator(int n) {
    if(n > 0) {
      numerator = n;
    }
  }

  public void setDenominator(int d) {
    if(d > 0) {
      denominator = d;
    }
  }

  public void add(int n, int d) {
    numerator = (numerator * d + n * denominator);
    denominator = denominator * d;
  }

  public void add(Fraction other) {
    numerator = (numerator * other.getDenominator() + other.getNumerator() * denominator);
    denominator = denominator * other.getDenominator();
  }

  public void multiply(int n, int d) {
    numerator *= n;
    denominator *= d;
  }

  public void multiply(Fraction other) {
    numerator *= other.getNumerator();
    denominator *= other.getDenominator();
  }
}
