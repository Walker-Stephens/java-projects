public class Ship
{
   protected double displacement;
   protected double length;
   
   public Ship(double displacement, double length)
   {
      this.displacement = displacement;
      this.length = length;
   }
   
   public double getDisplacement()
   {
      return displacement;
   }
   public double getLength()
   {
      return length;
   }
   
   public void setDisplacement(double displacement)
   {
      this.displacement = displacement;
   }
   public void setLength(double length)
   {
      this.length = length;
   }
   
   @Override
   public String toString()
   {
      return String.format("Displacement: %,.2f cubic feet  Length: %,.2f feet", displacement, length);
   }
}