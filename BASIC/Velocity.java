/*Write a JAVA program to accept initial velocity (u) , acceleration (a), and
time (t). Print the final velocity (v). ( Use formula v = u + at)*/



import java.io.*;
	public class Velocity
	    {
           public static void main(String args[])throws Exception
           		{
           			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

           			System.out.println("Enter The Initial Velocity  :");
           			int v=Integer.parseInt(br.readLine());

           			System.out.println("Enter The Acceleration(a)  :");
           			int a=Integer.parseInt(br.readLine());

           			System.out.println("Enter The Time(t) :");
           			int t=Integer.parseInt(br.readLine());


           			int ans=v+a*t;

           			System.out.println("The Final Velocity is  :" + ans);
           		}

	    }