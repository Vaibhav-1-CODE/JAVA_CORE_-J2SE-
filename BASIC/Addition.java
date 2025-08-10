//Addition Of Two Numbers,Using BufferReader.

import java.io.*;

public class Addition
 	{
 		public static void main(String args[]) throws Exception
 			{


           		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                	System.out.print("Enter The First Number  : ");
                	int a=Integer.parseInt(br.readLine());

                	System.out.print("Enter The Second Number  : ");
                	int b=Integer.parseInt(br.readLine());

                	int ans = a + b;

                	System.out.println("Addition =" + ans);
 			}
 	}