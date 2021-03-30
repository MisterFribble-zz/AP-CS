public class U8_L1_Activity_One {
  public static int diagSum(int[][] grid) {
    int sum = 0;
    int edge = grid.length;
    if (grid.length > grid[0].length) {
      edge = grid[0].length;
    }
    for (int i = 0; i < edge; i++) {
      sum += grid[i][i];
    }
    return sum;
  }
}
