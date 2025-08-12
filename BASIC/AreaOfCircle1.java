
//Area of Circle,Using Scanner.

import java.io.*;
import java.util.Scanner;

public class AreaOfCircle1
 	{
 		public static void main(String args[]) 
 			{


                    Scanner sc = new Scanner(System.in);

                	System.out.print("Enter The Radius Of Circle : ");
                	double radius=sc.nextInt();
            

                	
                	double ans = 3.14*radius*radius;

                	System.out.println("Area Of Circle  =" + ans);
 			}
 	}
