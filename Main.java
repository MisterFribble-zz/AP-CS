import edhesive.shapes.*;

public class Main {
  public static void main(String[] args) {
    Book one = new Book("It", "Stephen King", 1986);
    System.out.println(one);
    ChildrensBook two = new ChildrensBook("If you Give a Mouse a Cookie", "Laura Numeroff", 1985, "Felicia Bond");
    System.out.println(two);
  }
}