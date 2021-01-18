import edhesive.shapes.RegularPolygon;

public class U5_L3_Activity_Two {
  public static void randomize(RegularPolygon poly) {
    poly.setNumSides((int)(Math.random() * (20 - 10 + 1) + 10));
    poly.setSideLength(Math.random() * (12 - 5) + 5);
  }

  public static void main(String[] args) {
    RegularPolygon poly = new RegularPolygon();
    System.out.println(poly);
    randomize(poly);
    System.out.println(poly);
  }
}
