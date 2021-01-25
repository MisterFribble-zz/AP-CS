public class Vehicle {
  // Fields
  private int location;

  // Constructors
  public Vehicle() {
    location = 0;
  }

  public Vehicle(int loc) {
    this();
    if(loc >= -20 && loc <= 20) {
      location = loc;
    }
  }

  // Move forward one block, do not exceed 20
  public void forward() {
    location++;
    if(location > 20) {
      location = 20;
    }
  }

  // Move backward one block, do not exceed -20
  public void backward() {
    location--;
    if(location < -20) {
      location = -20;
    }
  }

  // Return the int value of location
  public int getLocation() {
    return location;
  }

  // Returns a String representation showing the vehicle as an @ character, with spaces to show its location
  public String toString() {
    String s = "";
    for(int i = -20; i < location; i++) {
      s += " ";
    }
    s += "@";
    return s;
  }
}
