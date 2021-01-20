public class Book {
  
  // The fields of our class
  private String title;
  private String author;
  private int year;

  // Constructor
  public Book(String a, String t, int y) {
    author = a;
    title = t;
    if (y >= 1450) {
      year = y;
    } else {
      year = 1900;
    }
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
    return title + "\n\t" + author + "\n\t" + year;
  }

  // equals() method
  public boolean equals(Book other) {
    if (title.equals(other.getTitle()) &&
        author.equals(other.getAuthor()) &&
        year == other.getYear()) {
      return true;
    }
    return false;
  }
}
