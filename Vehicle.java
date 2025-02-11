public abstract class Vehicle
{
   protected String manufacturer;
   protected String model;
   protected int year;
   
   public Vehicle(String manufacturer, String model, int year)
   {
      this.manufacturer = manufacturer;
      this.model = model;
      this.year = year;
   }
   
   public String getManufacturer()
   {
      return manufacturer;
   }
   public void setManufacturer(String manufacturer)
   {
      this.manufacturer = manufacturer;
   }
   
   public String getModel()
   {
      return model;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   
   public int getYear()
   {
      return year;
   }
   public void setYear(int year)
   {
      this.year = year;
   }
   
   @Override
   public String toString()
   {
      return String.format("Manufacturer: %s  Model: %s  Year: %d ", manufacturer, model, year);
   }
   
   public abstract int numberWheels();
}