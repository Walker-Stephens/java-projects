public class Customer
{
private int id;
private String name;
private int discount;

public Customer(int id, String name, int discount)
{
this.id = id;
this.name = name;
this.discount = discount;
}
public Customer(int id, String name)
{
this.id = id;
this.name = name;
}
@Override
public String toString()
{
return String.format("Id: %d Name: %s Discount: %d percent off", id, name, discount);
}

public int getId()
{
return id;
}
public void setId(int id)
{
this.id = id;
}

public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}

public int getDiscount()
{
return discount;
}
public void setDiscount(int discount)
{
this.discount = discount;
}

}