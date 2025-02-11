public class Car extends Vehicle implements Measurable
{
   private int numberDoors;
   
   public Car(String manufacturer, String model, int year, int numberDoors)
   {
      super(manufacturer, model, year);
      this.numberDoors = numberDoors;
   }
   
   public int getNumberDoors()
   {
      return numberDoors;
   }
   public void setNumberDoors(int numberDoors)
   {
      this.numberDoors = numberDoors;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Number of Doors: %d ", super.toString(), numberDoors);
   }
   
   public double getMileage()
   {
      return 400 * mileageRate;
   }
   public int numberWheels()
   {
      return 4;
   }
}
