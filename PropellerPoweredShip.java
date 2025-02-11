public class PropellerPoweredShip extends Ship
{
   private int numberPropellers;
   
   public PropellerPoweredShip(double displacement, double length, int numberPropellers)
   {
      super(displacement, length);
      this.numberPropellers = numberPropellers;
   }
   
   public int getNumberPropellers()
   {
      return numberPropellers;
   }
   public void setNumberPropellers(int numberPropellers)
   {
      this.numberPropellers = numberPropellers;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  Number of Propellers: %d", super.toString(), numberPropellers);
   }
}