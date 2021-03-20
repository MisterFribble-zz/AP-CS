public class Game
{
  public static void play(GameWheel g)
  {
    // Implement the play method here
    boolean sameColor = false;
    Slice spin1 = g.spinWheel();
    Slice spin2 = g.spinWheel();
    Slice spin3 = g.spinWheel();
    int total = spin1.getPrizeAmount() + spin2.getPrizeAmount() + spin3.getPrizeAmount();
    if (spin1.getColor().equals(spin2.getColor()) && spin2.getColor().equals(spin3.getColor())) {
      sameColor = true;
      total *= 2;
    }
    System.out.println("Total prize money: $" + total);
    System.out.println("\n Spin 1 - " + spin1);
    System.out.println("Spin 2 - " + spin2);
    System.out.println("Spin 3 - " + spin3);
    if (sameColor) {
      System.out.println("Three " + spin1.getColor() + " = double your money!");
    }
  }
}
