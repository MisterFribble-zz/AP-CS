import edhesive.shapes.*;

public class Main {
  public static void main(String[] args) {
    Book b = new Book("The Way of Kings", "Brandon Sanderson", 2011);
    Book c = new Book();
    Book d = new Book("Hunger Games");
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}