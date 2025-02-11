public class Employee
{
private int id;
private String firstName;
private String familyName;
private double salary;

public Employee(int id, String firstName, String familyName, double salary)
   {
   this.id = id;
   this.firstName = firstName;
   this.familyName = familyName;
   this.salary = salary;
   }
public Employee(int id, String firstName, String familyName)
   {
   this.id = id;
   this.firstName = firstName;
   this.familyName = familyName;
   this.salary = 0;
   }
@Override
public String toString()
{
return String.format("Name: %s %s, ID: %d, Salary: $%,.2f, Annual Salary: $%,.2f", firstName, familyName, id, salary, getAnnualSalary());
}
   
public int getId()
   {
   return id;
   }
public void setId(int id)
   {
   this.id = id;
   }

public String getFirstName()
   {
   return firstName;
   }
public void setFirstName(String firstName)
   {
   this.firstName = firstName;
   }

public String getFamilyName()
   {
   return familyName;
   }
public void setFamilyName(String familyName)
   {
   this.familyName = familyName;
   }
   
public double getSalary()
   {
   return salary;
   }
public void setSalary(double salary)
   {
   this.salary = salary;
   }

public double getAnnualSalary()
   {
   return 12 * salary;
   }
   
public void raiseSalary(int percent)
   {
   salary = salary * (percent/100.00) + salary;
   }

}