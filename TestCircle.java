public class TestCircle
{
   public static void main(String[] args)
   {
   Circle circle1 = new Circle();
   Circle circle2 = new Circle();
   circle1.setRadius(5);
   circle1.setColor("Blue");
   circle2.setRadius(7);
   circle2.setColor("Orange");
   System.out.printf("The radius of circle 1 is %f and its color is %s.%nThe radius of circle 2 is %f and its color is %s.%n",
   circle1.getRadius(), circle1.getColor(), circle2.getRadius(), circle2.getColor());
   }
}