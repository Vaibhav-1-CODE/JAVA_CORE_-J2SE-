/*Design A Employee Class With Member Eid,name,Salary,city[Using Setter & Getter]*/

import java.io.*;

class E1
{
	private int eid;
	private String ename;
	private double sal;
	private String city;

	public void setEid(int eid)
	{
		this.eid=eid;
	}

	public int getEid()
	{
		return eid;

	}

	public void setEname(String ename)
	{
		this.ename=ename;
	}

	public String getEname()
	{
		return ename;
	}

	public void setSal(double sal)
	{
		this.sal=sal;
	}
	public double getSal()
	{
		return sal;
	}

	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
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

        	E[i] = new E1();

        	E[i].setEid(id);
        	E[i].setEname(nm);
        	E[i].setSal(s);
        	E[i].setCity(c); 


        }

        for(int i=0;i<n;i++)
        {

        	System.out.println("______________________________________________________");
        	System.out.println("Employee Data  "+(i+1));

        	System.out.println("Employee Id Is :"+E[i].getEid());
            System.out.println("Employee Name Is :"+E[i].getEname());
            System.out.println("Employee Salary Is :"+E[i].getSal());
            System.out.println("Employee City Is :"+E[i].getCity());

        }
	}
}