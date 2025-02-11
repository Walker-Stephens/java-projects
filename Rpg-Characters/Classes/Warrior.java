public class Warrior extends Player implements Ninja
{
   protected double twoHandedBonus;
   
   public Warrior(String name, int xp, double twoHandedBonus)
   {
      super(name, xp);
      this.twoHandedBonus = twoHandedBonus;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s  Two-Handed Bonus: %.2fx", super.toString(), twoHandedBonus); 
   }
   
   public double getTwoHandedBonus()
   {
      return twoHandedBonus;
   }
   public void setTwoHandedBonus(double twoHandedBonus)
   {
      this.twoHandedBonus = twoHandedBonus;
   }
   
   public double getMeleeDamageModifier()
   {
      return 1.5;
   }
   
   public boolean hideShadows()
   {
      return false;
   }
}