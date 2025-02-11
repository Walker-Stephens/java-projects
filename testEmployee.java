import java.util.Scanner;
public class testEmployee
{
public static void main(String[] args)
{
Employee employee1 = new Employee(123, "John", "Smith", 1000);
Employee employee2 = new Employee(321, "Jake", "FrmStatFrm");
System.out.println(employee1);
Scanner in = new Scanner(System.in);
System.out.println("Type the salary increase percentage in percent.");
employee1.raiseSalary(in.nextInt());
System.out.println(employee1);
}
}