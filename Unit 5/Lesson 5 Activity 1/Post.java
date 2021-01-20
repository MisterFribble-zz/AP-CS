public class Post {
  // Fields
  private String user;
  private String content;
  private int favorites;

  // Constructor
  public Post(String name, String msg, int likes) {
    user = name;
    content = msg;
    favorites = likes;
  }

  // toString() method
  public String toString() {
    return user + "\n" + content + "\n\tFavorited by " + favorites + " users";
  }
}
