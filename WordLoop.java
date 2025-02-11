import java.util.Scanner;

public class WordLoop
{
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      String total = "";
      String word = "";
      while(!word.equals("halt"))
      {
        System.out.println("Enter a word or enter \"halt\" to quit.");
        word = in.nextLine();
        if(word.equals("halt"))
        {
         break;
        }
        total = total + word + " "; 
      }
      System.out.printf("%s", total);
   }
}