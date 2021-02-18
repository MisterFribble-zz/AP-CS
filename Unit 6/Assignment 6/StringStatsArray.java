public class StringStatsArray {

  // Add a final private variable to hold String array
  final private String[] array;

  public StringStatsArray(String[] a) {
    // Write constructor code
    array = a;
  }

  // Implement all methods as described
  public String toString() {
    String str = "{\"";
    for (int i = 0; i < array.length; i++) {
      str += array[i];
      if (i < array.length - 1) {
        str += "\", \"";
      }
    }
    str += "\"}";
    return str;
  }

  public double averageLength() {
    double average = 0;
    for (String d : array) {
      average += d.length();
    }
    average /= array.length;
    return average;
  }

  public int search(String target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public int sortStatus() {
    boolean aToZ = true;
    boolean zToA = true;
    boolean same = true;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i].compareToIgnoreCase(array[i + 1]) > 0) {
        aToZ = false;
        same = false;
      }
      if (array[i].compareToIgnoreCase(array[i + 1]) < 0) {
        zToA = false;
        same = false;
      }
    }
    if (aToZ || same) {
      return 1;
    } else if (zToA) {
      return -1;
    }
    return 0;
  }

}
