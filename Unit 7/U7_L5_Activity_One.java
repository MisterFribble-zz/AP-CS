public class U7_L5_Activity_One {
  public static void sortAndPrint(String[] arr) {
    for (int j = 0; j < arr.length - 1; j++) {
      int minIndex = j;
      for (int k = j + 1; k < arr.length; k++) {
        if (arr[k].compareTo(arr[minIndex]) < 0) {
          minIndex = k;
        }
      }
      String temp = arr[j];
      arr[j] = arr[minIndex];
      arr[minIndex] = temp;
    }
    for (String string : arr) {
      System.out.print(string + " ");
    }
  }
}
