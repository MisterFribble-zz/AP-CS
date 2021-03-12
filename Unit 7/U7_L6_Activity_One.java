public class U7_L6_Activity_One {
  public static void sortAndPrint (String[] arr) {
    for (int j = 1; j < arr.length; j++) {
      String temp = arr[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(arr[possibleIndex - 1]) < 0) {
        arr[possibleIndex] = arr[possibleIndex - 1];
        possibleIndex--;
      }
      arr[possibleIndex] = temp;

      for (String string : arr) {
        System.out.print(string + " ");
      }
      System.out.println();
    }
    
  }
}
