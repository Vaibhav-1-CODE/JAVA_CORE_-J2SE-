/*Design A Employee Class With Member Eid,name,Salary,city.Dispaly It [Useing Parameterized Constructor]*/

import java.io.*;

class E1
{
	private int eid;
	private String ename;
	private double sal;
	private String city;

	E1(int eid,String ename,double sal ,String city)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
		this.city=city;
	}

	public void display()
	{

        	System.out.println("Employee Id Is :"+eid);
            System.out.println("Employee Name Is :"+ename);
            System.out.println("Employee Salary Is :"+sal);
            System.out.println("Employee City Is :"+city);
	}
}



public class Employee
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How Many Employee  :");
		int n=Integer.parseInt(br.readLine());

        E1 E[]=new E1[n];

        for(int i=0;i<n;i++)
        {
        	System.out.println("-------------------------------------");
        	System.out.println("Employee"+(i+1));

        	System.out.print("Enter The Id OF Employee  :");
        	int id = Integer.parseInt(br.readLine());

        	System.out.print("Enter The Name :");
        	String nm = br.readLine();

        	System.out.print("Enter The Salary :");
        	double s = Double.parseDouble(br.readLine());

        	System.out.print("Enter The City :");
        	String c = br.readLine();

        	E[i] = new E1(id,nm,s,c);

        	 


        }

        for(int i=0;i<n;i++)
        {

        	System.out.println("______________________________________________________");
        	System.out.println("Employee Data  "+(i+1));
           
           E[i].display();

        }
	}
}