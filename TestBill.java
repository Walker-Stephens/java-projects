import java.util.Scanner;
public class TestBill
{
   public static void main(String[] args)
   {
   Bill bill1 = new Bill(1, "John", 10.50);
   Bill bill2 = new Bill("Jane");
   System.out.println(bill1);
   System.out.println(bill2);
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the tax percentage in decimal.");
   double tax = in.nextDouble();
   System.out.printf("The tax for John is $%.2f and the tax for Jane is $%.2f.%n"
   ,bill1.calculateTax(tax), bill2.calculateTax(tax));
  
   
   
   
   }
}