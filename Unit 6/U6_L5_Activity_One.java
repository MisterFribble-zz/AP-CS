public class U6_L5_Activity_One{

  public static void reverse(String[] words){
    for(String s : words){
      for(int i = s.length(); i > 0; i--){
        System.out.print(s.substring(i - 1, i));
      }
      System.out.println();
    }
  }

}
