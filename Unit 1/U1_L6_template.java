/*
 * Unit 1 - Lesson 6 - Numeric Casts
 */

import java.io.*;

class U1_L6_template{
  
  public static void main (final String str[]) throws IOException {
    // negative round down
    final double w = -21.54;
    // negative round up
    final double x = -12.3;
    // positive round up
    final double y = 34.5;
    // positive round down
    final double z = 67.4;

    final int roundW = (int) (w - 0.5);
    final int roundX = (int) (x - 0.5);
    final int roundY = (int) (y + 0.5);
    final int roundZ = (int) (z + 0.5);
    
    System.out.println(roundW + " " + roundX + " " + roundY + " " + roundZ);
  }

}