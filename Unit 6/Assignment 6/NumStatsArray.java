public class NumStatsArray {

  // Add a final private variable to hold double array
  final private double[] array;

  public NumStatsArray(double[] a) {
    // Write constructor code
    array = a;
  }

  // Implement all methods as described
  public String toString() {
    String output = "{";
    for (int i = 0; i < array.length; i ++) {
      output += array[i];
      if (i < array.length - 1) {
        output += ", ";
      }
    }
    output += "}";
    return output;
  }

  public double average() {
    double average = 0;
    for (double d : array) {
      average += d;
    }
    average /= array.length;
    return average;
  }

  public double range() {
    double min = array[0];
    double max = array[0];
    for (double d : array) {
      if (max < d) {
        max = d;
      } else if (min > d) {
        min = d;
      }
    }
    return max - min;
  }

  public int sortStatus() {
    boolean inc = true;
    boolean dec = true;
    boolean same = true;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        inc = false;
        same = false;
      }
      if (array[i] < array[i + 1]) {
        dec = false;
        same = false;
      }
    }
    if (inc || same) {
      return 1;
    } else if (dec) {
      return -1;
    }
    return 0;
  }

}
