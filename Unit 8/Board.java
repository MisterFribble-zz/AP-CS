public class Board {

  private String[][] squares;

  public Board() {
    String[][] startGrid = new String[10][10];
    for (int i = 0; i < startGrid.length; i++) {
      for (int j = 0; j < startGrid[i].length; j++) {
        startGrid[i][j] = "-";
      }
    }
    squares = startGrid;
  }

  public String toString() {
    String str = "";
    for (String[] strings : squares) {
      for (String string : strings) {
        str += string + " ";
      }
      str += "\n";
    }
    return str;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal) {
    if (row >= 0 && row < 10 && col > -1 && col < 10) {
      if (horizontal) {
        if (col + len <= 9) {
          for (int i = col; i < col + len; i++) {
            if (squares[row][i].equals("b")) {
              return false;
            }
          }
          for (int j = col; j < col + len; j++) {
            squares[row][j] = "b";
          }
          return true;
        }
      } else {
        if (row + len <= 9) {
          for (int i = row; i < row + len; i++) {
            if (squares[i][col] == "b") {
              return false;
            }
          }
          for (int j = row; j < row + len; j++) {
            squares[j][col] = "b";
          }
          return true;
        }
      }
    }
    return false;
  }

  public boolean foundShip(int len) {
    for (int i = 0; i < squares.length; i++) {
      int count = 0;
      for (int j = 0; j < squares[i].length; j++) {
        while (squares[i][j].equals("b") && j < squares.length) {
          count++;
          j++;
        }
        if (count == len) {
          return true;
        }
        count = 0;
      }
    }
    for (int i = 0; i < squares[0].length; i++) {
      int count = 0;
      for (int j = 0; j < squares.length; j++) {
        while (squares[j][i].equals("b") && j < squares.length) {
          j++;
          count++;
        }
        if (count == len) {
          return true;
        }
        count = 0;
      }
    }
    return false;
  }

  public int shoot(int row, int col) {
    if (row < 0 || row > 9 || col < 0 || col > 9) {
      return -1;
    } else if (squares[row][col] == "-") {
      squares[row][col] = "m";
      return 0;
    } else if (squares[row][col] == "b") {
      squares[row][col] = "x";
      return 1;
    }
    return 2;
  }

  public boolean gameOver() {
    for (String[] strings : squares) {
      for (String string : strings) {
        if (string == "b") {
          return false;
        }
      }
    }
    return true;
  }

}
