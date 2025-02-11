import java.util.ArrayList;
import java.util.Scanner;

public class TwoSeven
{
   public static void main(String[] args)
   {
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      list1.add(4);
      list1.add(5);
      list1.add(2);
      list1.add(7);
      
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      list2.add(2);
      list2.add(7);
      list2.add(7);
      list2.add(2);
      
      ArrayList<Integer> list3 = new ArrayList<Integer>();
      list3.add(6);
      list3.add(9);
      list3.add(8);
      list3.add(0);
      
      ArrayList<Integer> list4 = new ArrayList<Integer>();
      list4.add(2);
      list4.add(2);
      list4.add(2);
      list4.add(2);
      
      System.out.println(allTwoSeven(list1));
      System.out.println(allTwoSeven(list2));
      System.out.println(allTwoSeven(list3));
      System.out.println(allTwoSeven(list4));
      
      /*ArrayList<Integer> list5 = new ArrayList<Integer>();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter four integers.");
      list5.add(in.nextInt());
      list5.add(in.nextInt());
      list5.add(in.nextInt());
      list5.add(in.nextInt());
      System.out.println(allTwoSeven(list5));*/
      
      
   }
   public static int allTwoSeven(ArrayList<Integer> a)
   {
      int num = 19;
      for(int i = 0; i < a.size(); i++)
      {
         if(a.get(i) == 2 || a.get(i) == 7)
         {
         continue;
         }
         else
         {
         num = -7;
         }
      }
      return num;
   }
}