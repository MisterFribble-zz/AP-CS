public class ChildrensBook extends Book {
  // Additional class fields
  private String illustrator;

  // Constructor
  public ChildrensBook(String t, String a, int y, String i) {
    super(t, a, y);
    illustrator = i;
  }

  // toString
  public String toString() {
    return super.toString() + "\n\t" + illustrator;
  }
}
