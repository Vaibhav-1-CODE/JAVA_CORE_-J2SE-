//Addition Of Two Numbers,Using Scanner.



import java.io.*;
import java.util.Scanner;



public class Addition1
 	{
 		public static void main(String args[]) 
 			{


           		   Scanner sc = new Scanner(System.in);

                	System.out.print("Enter The First Number  : ");
                	int a=sc.nextInt();

                	System.out.print("Enter The Second Number  : ");
                	int b=sc.nextInt();

                	int ans = a + b;

                	System.out.println("Addition =" + ans);
 			}
 	}