import java.util.Scanner;
import java.lang.*;

class second
{
 public static void main(String args[])
 {
   int x,y,sum;
   Scanner obj=new Scanner(System.in);
   System.out.println("Type number: ");
   x = obj.nextInt();
   
   System.out.println("Type another number ");
   y = obj.nextInt();
   
   sum=x+y;
   System.out.println("Sum :"+ sum);
 }
}