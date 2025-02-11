public class MotorCycle extends Vehicle implements Measurable
{
   public int engineDisplacement;
   
   public MotorCycle(String manufacturer, String model, int year, int engineDisplacement)
   {
      super(manufacturer, model, year);
      this.engineDisplacement = engineDisplacement;
   }
   
   public int getEngineDisplacement()
   {
      return engineDisplacement;
   }
   public void setEngineDisplacement(int engineDisplacement)
   {
      this.engineDisplacement = engineDisplacement;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s Engine Displacement: %dcc", super.toString(), engineDisplacement);
   }
   
   public double getMileage()
   {
      return 200 * mileageRate;
   }
   
   public int numberWheels()
   {
      return 2;
   }
}
