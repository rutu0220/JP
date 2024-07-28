import java.util.*;
import java.util.Scanner;

class DMY
{
   public static void main(String args[])
   {
     int d = Integer.parseInt(args[0]);
     int m = Integer.parseInt(args[1]);
     int y = Integer.parseInt(args[2]);
     
     String week[]={"Sun","mon","tue","wed","thur","fri","sat"};
     int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

     int totalDays = 0;
     int i,j;
     for(i=1; i<y; i++)
     {
       totalDays += isLeapYear(i) ? 366 : 365;
     }
     for(j=1; j<m; j++)
     {
        totalDays = mon[j-1];
     }
     if(m>2 && isLeapYear(y))
     {
       totalDays++;
     }
     totalDays += d;
     int day = totalDays % 7;
     System.out.println("The day of this date is :" + d +"/"+ m +"/" + y + "=" + week[day]);
   }
     public static boolean isLeapYear(int year)
     {
       return(year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
     }
}