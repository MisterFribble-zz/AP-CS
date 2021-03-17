import java.util.ArrayList;
import java.util.Random;

public class GameWheel {
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos; // Position of currently selected slice on wheel

  /*
   * Returns string representation of GameWheel with each numbered slice on a new
   * line
   */
  public String toString() {
    // Implement the toString method here
    String str = "";
    for (int i = 0; i < slices.size(); i++) {
      str += "\n" + i + " - " + slices.get(i).toString();
    }
    return str;
  }

  /*
   * Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  public void scramble() {
    // Implement the scramble method here
    Random rand = new Random();
    int random = rand.nextInt(20);
    for (int i = 0; i < 20; i++) {
      if (slices.get(i).getColor() == "black") {
        while (random % 5 != 0) {
          random = rand.nextInt(20);
        }
      } else if (slices.get(i).getColor() == "red") {
        while (random % 5 == 0 || random % 2 == 0) {
          random = rand.nextInt(20);
        }
      } else {
        while (random % 2 != 0 || random % 5 == 0) {
          random = rand.nextInt(20);
        }
      }
      Slice temp = slices.get(i);
      slices.set(i, slices.get(random));
      slices.set(random, temp);
    }
  }

  /*
   * Sorts the positions of the slices that are in the wheel by prize amount, but
   * without changing the pattern of the colors.
   */
  public void sort() {
    // Implement the sort method here
    for (int i = 0; i < 3; i++) {
      boolean black = false;
      int interval = 2;
      int start = 0;

      if (slices.get(i).getColor() == "black") {
        black = true;
        interval = 5;
      } else if (slices.get(i).getColor() == "red") {
        start = 1;
      }

      for (int j = start; j < slices.size() - 1; j += interval) {
        int minIndex = i;
        if (black || i % 5 != 0) {
          for (int k = i + 1; k < slices.size(); k += interval) {
            if (slices.get(j).getPrizeAmount() < slices.get(minIndex).getPrizeAmount()) {
              minIndex = j;
            }
          }
        }
      }
    }
  }

  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

  /*
   * Creates a wheel with 20 preset slices
   */
  public GameWheel() {
    this(getStandardPrizes());
  }

  /*
   * Creates a wheel with 20 slices, using values from array parameter
   */
  public GameWheel(int[] prizes) {
    currentPos = 0;
    slices = new ArrayList<Slice>();
    for (int i = 0; i < 20; i++) {
      int pa = 0;
      String col = "blue";
      if (i < prizes.length)
        pa = prizes[i];
      if (i % 5 == 0)
        col = "black";
      else if (i % 2 == 1)
        col = "red";
      slices.add(new Slice(col, pa));
    }
  }

  /*
   * Spins the wheel by so that a different slice is selected. Returns that slice
   * (Note: the 10 slices following the current slice are more likely to be
   * returned than the other 10).
   */
  public Slice spinWheel() {
    // spin power between range of 1-50 (inclusive)
    int power = (int) (Math.random() * 50 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }

  public Slice getSlice(int i) {
    int sliceNum = i;
    if (i < 0 || i > 19)
      sliceNum = 0;
    return slices.get(sliceNum);
  }

  // Makes an array with a standard list of prizes
  private static int[] getStandardPrizes() {
    int[] arr = new int[20];
    for (int i = 0; i < 20; i++) {
      if (i % 5 == 0)
        arr[i] = i * 1000;
      else if (i % 2 == 1)
        arr[i] = i * 100;
      else
        arr[i] = i * 200;
    }
    return arr;
  }
}
