
//Area of Circle,Using BufferReader.

import java.io.*;

public class AreaOfCircle
 	{
 		public static void main(String args[]) throws Exception
 			{


           		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                	System.out.print("Enter The Radius Of Circle : ");
                	double radius=Float.parseFloat(br.readLine());

                	
                	double ans = 3.14*radius*radius;

                	System.out.println("Area Of Circle  =" + ans);
 			}
 	}
