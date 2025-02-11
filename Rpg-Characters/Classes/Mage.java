public class Mage extends Player implements Ninja
{
   protected double spellBonus;
   
   public Mage(String name, int xp, double spellBonus)
   {
      super(name, xp);
      this.spellBonus = spellBonus;
   }
   @Override
   public String toString()
   {
      return String.format("%s  Spell Bonus: %.2fx", super.toString(), spellBonus);
   }
   
   public double getSpellBonus()
   {
      return spellBonus;
   }
   public void setSpellBonus(double spellBonus)
   {
      this.spellBonus = spellBonus;
   }
   
   public double getMeleeDamageModifier()
   {
      return 1.00;
   }
   
   public boolean hideShadows()
   {
      return false;
   }
}