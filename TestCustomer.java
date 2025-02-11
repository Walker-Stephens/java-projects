import java.util.Scanner;
public class TestCustomer
{
public static void main(String[] args)
   {
   Customer customer1 = new Customer(123, "John Doe");
   Customer customer2 = new Customer(321, "Jane Doe", 50);
   Customer customer3 = new Customer(000, "JD");
   System.out.println(customer1);
   System.out.println(customer2);
   Scanner in = new Scanner(System.in);
   System.out.println("Enter an Id.");
   customer3.setId(in.nextInt());
   in.nextLine();
   System.out.println("Enter a name.");
   customer3.setName(in.nextLine());
   System.out.println("Enter a discount.");
   customer3.setDiscount(in.nextInt());
   System.out.println(customer3);
   

   }
}