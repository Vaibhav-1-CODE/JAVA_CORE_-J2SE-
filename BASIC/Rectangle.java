import java.io.*;


public class Rectangle
	{
		public static void main(String args[])throws Exception
	    	{
	    		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	    		System.out.print("Enter The HEight Of Rectangle :");
	    		double height=Float.parseFloat(br.readLine());

	    		System.out.print("Enter The Width Of Rectangle  :");
	    		double width=Float.parseFloat(br.readLine());

	    		double ans1=2*(height+width);
	    		double ans2=(height*width);

	    		System.out.println("The Primeter Of Rectangle Is :" + ans1);

	    		System.out.println("The Area Of Rectangle Is : " + ans2 );


	    	}
	} 