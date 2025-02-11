import java.util.Scanner;
public class TestCircle1
{
  public static void main(String[] args)
  { 
  Circle1 circleA = new Circle1(2,"Blue");
   System.out.println(circleA);
   Circle1 circleB = new Circle1();
   Scanner in = new Scanner(System.in);
   System.out.println("Enter a radius.");
   circleB.setRadius(in.nextInt());
   System.out.println("Enter a color.");
   in.nextLine();
   circleB.setColor(in.nextLine());
   System.out.println(circleB);
   
   
  }
}
