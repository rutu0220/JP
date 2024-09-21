import java.util.Scanner;
import java.lang.*;

class Quot
{
  public static void main(String args[])
  {
    int dividend , divisor, quotient,reminder;
    Scanner sc = new Scanner(System.in);
    System.out.println("Type dividend: ");
    dividend = sc.nextInt();
    System.out.println("Type divisor: ");
    divisor = sc.nextInt();
    System.out.println("Type divisor: ");
    
    quotient = dividend/divisor;
    reminder = dividend % divisor;
    System.out.println("quotient"+ quotient);
    System.out.println("reminder"+ reminder);

    
    
  }
}