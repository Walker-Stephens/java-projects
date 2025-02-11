public class WindPoweredShip extends Ship
{
   private int numberMasts;
   
   public WindPoweredShip(double displacement, double length, int numberMasts)
   {
      super(displacement, length);
      this.numberMasts = numberMasts;
   }
   
   public int getNumberMasts()
   {
      return numberMasts;
   }
   public void setNumberMasts(int numberMasts)
   {
      this.numberMasts = numberMasts;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  Number of Masts: %d", super.toString(), numberMasts);
   }
}
