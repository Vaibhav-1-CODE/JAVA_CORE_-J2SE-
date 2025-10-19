/*Write a java Program Which Stores 'N' Objed=ct Information And Dispaly It .[Using Setter And Getter ]*/

import java.io.*;

class S1
{
	private int rno;
	private String name;
	private double per;

	public void setRno(int rno)
	{
       this.rno=rno;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setPer(double per)
	{
		this.per=per;
	}

	public int getRno()
	{
		return rno;
	}

	public String getName()
	{
		return name;
	}

	public double getPer()
	{
		return per;
	}



}

public class Student
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


		System.out.print("How Many Students  :");
		int n = Integer. parseInt(br.readLine());

		S1 S[]= new S1[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("-------------------------------");
			System.out.println("STUDENT  :"+(i+1));
            
            System.out.print("Enter The Roll NO  :");
            int r =Integer.parseInt(br.readLine());

            System.out.print("Enter The Name :");
            String nm =br.readLine();

            System.out.print("Enter The Percentage  :");
            double per = Double.parseDouble(br.readLine());

            S[i]=new S1();

            S[i].setRno(r);
            S[i].setName(nm);
            S[i].setPer(per);

		}

         

		for(int i=0;i<n;i++)
		{
			System.out.println("----------------------------");
			System.out.println("Student Data :"+(i+1));
			


		System.out.println("The Roll Number is  :"+S[i].getRno());
		System.out.println("The Name Is         :"+S[i].getName());
        System.out.println("The Percentage Is   :"+S[i].getPer());
	

		}
	}
} 