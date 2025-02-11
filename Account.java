public class Account
{
  private String accountHolder;
  private int accountNumber;
  private double balance;
   
  public String getAccountHolder()
   {
      return accountHolder;
   }
  public void setAccountHolder(String accountHolder)
   {
      this.accountHolder = accountHolder;
   }
   
   public int getAccountNumber()
   {
      return accountNumber;
   }
   
   public void setAccountNumber(int accountNumber)
   {
      this.accountNumber = accountNumber;
   }
      
   public double getBalance()
   {
      return balance;
   }
   
   public void setBalance(double balance)
   {
      this.balance = balance;
   }
}