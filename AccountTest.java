import java.util.Scanner;
public class AccountTest
{
   public static void main(String[] args)
   {
   Scanner in = new Scanner(System.in);
   Account account1 = new Account();
   System.out.println("Enter the account holder's name.");
   account1.setAccountHolder(in.nextLine());
   System.out.println("Enter the account number.");
   account1.setAccountNumber(in.nextInt());
   System.out.println("Enter the balance.");
   account1.setBalance(in.nextDouble());
   
   System.out.printf("Account Owner: %s%nAccount Number: %d%nAccount Balance: $%.2f%n",
   account1.getAccountHolder(), account1.getAccountNumber(), account1.getBalance());
   }
}