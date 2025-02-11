public class Bill
{
private int number;
private String name;
private double amount;

@Override
public String toString()
{
return String.format("Name: %s%nNumber: %d%nAmount: $%.2f%n", name, number, amount);
}

public Bill(int number, String name, double amount)
{
this.number = number;
this.name = name;
this.amount = amount;
}
public Bill(String name)
{
this.name = name;
this.number = 999;
this.amount = 0.0;
}

public int getNumber()
{
return number;
}
public void setNumber(int number)
{
this.number = number;
}

public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}

public double getAmount()
{
return amount;
}
public void setAmount(double amount)
{
this.amount = amount;
}

public double calculateTax(double percentage)
{
return amount * percentage;
}

}
