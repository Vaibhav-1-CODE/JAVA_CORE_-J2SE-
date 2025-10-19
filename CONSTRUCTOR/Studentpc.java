/*Write A Java Program Which Stores 'n' Object Information And Dispaly It [Useing Parameterized Constructor] */

import java.io.*;

class S1
{

	private int rno;
	private String name;
	private double per;

	S1(int rno,String name,double per)
	{
      this.rno=rno;
      this.name=name;
      this.per=per;

	}

	public void display()
	{
		
			
			System.out.println("The Roll Number Is :"+ rno);
			System.out.println("Student Name  Is   : "    + name);
			System.out.println("The Percentage Is  : " +per);
			System.out.println("------------------------------------");
	   
	}
}




public class Studentpc
{
	public static void main(String[] args)throws Exception
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 System.out.print("How Many Students  :");
		 int n= Integer.parseInt(br.readLine());

		 S1 S[] = new S1[n]; //Array Of The Variable 

		 //Creating Array Of Object 

		 for(int i=0;i<n;i++)
		 {
		 	System.out.println("STUDENT  :"+ (i+1));
		 	System.out.print("Enter The Roll Number : ");
		 	int r= Integer.parseInt(br.readLine());

		 	System.out.print("Enter The Name :");
		 	String nm= br.readLine();

		 	System.out.print("Enter The Percentage :");
		 	double p= Double.parseDouble(br.readLine());

		 	S[i]=new S1(r,nm,p);

		 }

		 System.out.println("STUDENT INFORMATION  \n");
		 System.out.println("--------------------------------------");

         for(int i=0;i<n;i++)
         {
         	System.out.println("STUDENT DATA OF :"+ (i+1));
			 S[i].display();

         }
	}
}