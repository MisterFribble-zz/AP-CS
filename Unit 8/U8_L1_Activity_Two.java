public class U8_L1_Activity_Two {
  public static int[][] multTable(int rows, int columns) {
    int[][] table = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        table[i][j] = i * j;
      }
    }
    return table;
  }
}
