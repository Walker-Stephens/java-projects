public class TestVehicle
{
   public static void main(String[] args)
   {
      Vehicle[] vehicles = {new Car("Ford", "Mustang", 1969, 2),
      new Car("Honda", "Civic", 2024, 4), new MotorCycle("Indian", "Scout",
      2015, 1133), new MotorCycle("Kawasaki", "GSXR", 1991, 1127)};
      
      for( Vehicle vehicle : vehicles)
      {
         System.out.println(vehicle);
         System.out.printf("The number of wheels is %d.%n", vehicle.numberWheels());
         System.out.printf("The mileage is %,.2f miles.%n%n", ((Measurable)vehicle).getMileage());
      }
   }
}