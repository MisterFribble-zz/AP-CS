public class Book {

  // The fields of our class
  private String title;
  private String author;
  private int year;
  private static int num;
  private int bookID;
  
  // Constructors
  public Book(String t, String a, int y) {
    setTitle(t);
    setAuthor(a);
    setYear(y);
    num++;
    bookID = num;
  }

  public Book() {
    this("None", "Unknown", 1900);
  }

  public Book(String t) {
    this(t, "Unknown", 1900);
  }

  public Book(int y) {
    this("None", "Unknown", y);
  }

  // Accessors
  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  // Mutators
  public void setAuthor(String a) {
    author = a;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setYear(int y) {
    if (y >= 1450) {
      year = y;
    } else {
      year = 1900;
    }
  }

  // toString() method
  public String toString() {
    return title + "\n\t" + author + "\n\t" + year + "\n\tBookID: " + bookID;
  }

  // equals() method
  public boolean equals(Book other) {
    if (title.equals(other.getTitle()) && author.equals(other.getAuthor()) && year == other.getYear()) {
      return true;
    }
    return false;
  }

  public static int getNextID() {
    return num + 1;
  }
}
