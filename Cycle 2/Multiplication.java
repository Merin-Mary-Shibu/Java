import java.util.*;
class Multiplication 
{
        public static void main(String args [])
         {
             int i,j,k;
             int a[][] = new int[20][20];
             int b[][] = new int[20][20];
             int c[][] = new int[20][20];
             Scanner obj = new Scanner(System.in);
             System.out.print("Enter no of rows of first matrix: ");
             int r1 = obj.nextInt();
             System.out.print("Enter no of columns of first matrix: ");
             int c1 = obj.nextInt();

             System.out.print("Enter no of rows of second matrix: ");
             int r2 = obj.nextInt();
             System.out.print("Enter no of columns second matrix: ");
             int c2 = obj.nextInt();
             
             if(c1==r2)
              {  
                 System.out.println("Enter elements of first matrix:");
                 for(i=0;i<r1;i++)
                   for(j=0;j<c1;j++)
                    {
                     a[i][j] = obj.nextInt();
                    }
  
                   System.out.println("Enter elements of second matrix:");
                   for(i=0;i<r2;i++)
                     for(j=0;j<c2;j++)
                     {
                       b[i][j] = obj.nextInt();
                    }
        
                    System.out.println("Result: ");
                    for(i=0;i<r1;i++)
                       { 
                         for(j=0;j<c2;j++)
                           {
                            c[i][j]=0;
                            for(k=0;k<c1;k++)
                              {
                               c[i][j] += a[i][k] * b[k][j];
                              }
                           } 
                        }
                    for(i=0;i<r1;i++)
                     { 
                        System.out.println("\n");
                        for(j=0;j<c2;j++)
                        {
                         System.out.print(" "+c[i][j]);
                       }  
                    }    
                }
             else
                  System.out.println("Matrix multiplication is not possible!");
         }
    }
