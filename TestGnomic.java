public class TestGnomic
{
   public static void main(String[] args)
   {
      Gnomic gnome = new Gnomic(5, "George", 75.0);
      
      gnome.zoochory(2.0);
      gnome.vacive();
      gnome.yetling("dog", 4);
      gnome.collatz(5);
      
      System.out.println(gnome);
   }
}