public class Circle1
{
   private int radius;
   private String color;
   
   public Circle1(int radius, String color)
   {
   this.radius = radius;
   this.color = color;
   }
   public Circle1()
   {
   this.radius = 0;
   this.color = "Black";
   }
   @Override
   public String toString()
   {
   return String.format("Radius: %d Color: %s%n", radius, color);
   }
   
   public int getRadius()
   {
   return radius;
   }
   public void setRadius(int radius)
   {
   this.radius = radius;
   }
   public String getColor()
   {
   return color;
   }
   public void setColor(String color)
   {
   this.color = color;
   }
}