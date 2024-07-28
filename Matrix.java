import java.util.*;
import java.util.Scanner;

class Matrix 
{
   void setMatrix(int m[][],int row,int col)
   {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter array elements :");
   for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
    {
   m[i][j] = obj.nextInt();
    }
  }
  //print
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      System.out.println("MAtrix = m["+i+"]["+j+"]" + m[i][j]);
    }

   }
 } 
   public static void main(String args[])
   {
    //int row,col;
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter no. of rows ");
     int row = obj.nextInt();
     System.out.println("Enter no. of columns ");
     int col = obj.nextInt();
     Matrix matrix = new Matrix();
     int m1[][] = new int[row][col];
     matrix.setMatrix(m1, row, col);
     int m2[][] = new int[row][col];
     matrix.setMatrix(m2, row, col);
     int[][] m3 = new int[row][col];
     MatrixOper obj2 = new MatrixOper();
        int ch;
        do {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.println("Enter your choice: ");
            ch = obj.nextInt();
            switch (ch) {
                case 1:
                    obj2.addition(m1, m2, m3, row, col);
                    obj2.display(m3, row, col);
                    break;
                case 2:
                    obj2.sub(m1, m2, m3, row, col);
                    obj2.display(m3, row, col);
                    break;
                case 3:
                    obj2.mul(m1, m2, m3, row, col);
                    obj2.display(m3, row, col);
                    break;
                case 4:
                    obj2.div(m1, m2, m3, row, col);
                    obj2.display(m3, row, col);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
        } while (ch != 5);
   }
}

 // clas for methods
  
  class MatrixOper
  {
    //addition 
    void addition(int m1[][],int m2[][],int m3[][],int row,int col)
    {
      int i,j;
      for(i=0;i<row;i++)
     {
     for(j=0;j<col;j++)
       {
      //System.out.println("MAtrix = m3["+i+"]["+j+"]" + m1[i][j] + m2[i][j]);
      m3[i][j] = m1[i][j] + m2[i][j];
    }
     }
    }
    //subtraction 
    void sub(int m1[][],int m2[][],int m3[][],int row,int col)
    {
    int i,j;
    for(i=0;i<row;i++)
    {
     for(j=0;j<col;j++)
    {
      m3[i][j] = m1[i][j] - m2[i][j];
    }
     }
    }

    //multiplication
    void mul(int m1[][],int m2[][],int m3[][],int row,int col)
    {
      int i,j;
      for(i=0;i<row;i++)
     {
     for(j=0;j<col;j++)
    {
      m3[i][j] = m1[i][j] * m2[i][j];
    }
     }
    }
    // division
    void div(int m1[][],int m2[][],int m3[][],int row,int col)
    {
      int i,j;
      for(i=0;i<row;i++)
     {
     for(j=0;j<col;j++)
    {
      m3[i][j] = m1[i][j] / m2[i][j];
    }
     }
    }
    //display
     void display(int m3[][],int row,int col)
     {
      int i,j;
    System.out.println("After operation :");
     for(i=0;i<row;i++)
    {
    for(j=0;j<col;j++)
    {
      System.out.println("MAtrix = m3["+i+"]["+j+"]" + m3[i][j]);
    }
    } 
   }
  }