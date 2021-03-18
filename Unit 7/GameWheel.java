import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GameWheel {
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos; // Position of currently selected slice on wheel
  ArrayList<Slice> blacks = new ArrayList<>();
  ArrayList<Slice> reds = new ArrayList<>();
  ArrayList<Slice> blues = new ArrayList<>();

  /*
   * Returns string representation of GameWheel with each numbered slice on a new
   * line
   */
  public String toString() {
    // Implement the toString method here
    String str = "";
    for (int i = 0; i < slices.size(); i++) {
      str += "\n" + i + " - " + slices.get(i);
    }
    return str;
  }

  /*
   * Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  public void scramble() {
    // Implement the scramble method here
    splitList();
    Collections.shuffle(blacks);
    Collections.shuffle(reds);
    Collections.shuffle(blues);
    combineLists();
  }

  /*
   * Sorts the positions of the slices that are in the wheel by prize amount, but
   * without changing the pattern of the colors.
   */
  public void sort() {
    // Implement the sort method here
    splitList();
    sortList(blacks);
    sortList(reds);
    sortList(blues);
    combineLists();
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

  // Helpful Methods
  private void splitList() {
    for (int i = slices.size() - 1; i >= 0; i--) {
      if (slices.get(i).getColor().equals("black")) {
        blacks.add(slices.remove(i));
      } else if (slices.get(i).getColor().equals("red")) {
        reds.add(slices.remove(i));
      } else {
        blues.add(slices.remove(i));
      }
    }
  }

  private void combineLists() {
    Iterator<Slice>blackIterator = blacks.iterator();
    Iterator<Slice>redIterator = reds.iterator();
    Iterator<Slice>blueIterator = blues.iterator();

    for (int i = 0; i < 20; i++) {
      if (i % 5 == 0) {
        slices.add(blackIterator.next());
      } else if (i % 2 == 1) {
        slices.add(redIterator.next());
      } else {
        slices.add(blueIterator.next());
      }
    }
    blacks.clear();
    reds.clear();
    blues.clear();
  }

  private void sortList(ArrayList<Slice> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j).getPrizeAmount() < list.get(minIndex).getPrizeAmount()) {
          minIndex = j;
        }
      }
      Collections.swap(list, i, minIndex);
    }
  }
}
