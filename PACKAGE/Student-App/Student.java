/*Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class
TYMarks (members – Theory, Practicals). Create n objects of Student class (having rollNumber,
name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate
the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and
display the result of the student in proper format.*/


import java.io.*;
import SY.SYMarks;
import TY.TYMarks;



 class S1
 {
 	 int rno;
	 String name;
	 SYMarks sy;
     TYMarks ty;
     double total;
     String grade;

     public S1(int rno , String name, SYMarks sy,TYMarks ty)
     {
     	this.rno=rno;
     	this.name=name;
     	this.sy=sy;
     	this.ty=ty;
     	calculateResult();
     }

     public void calculateResult()

     {

         total = (sy.ComputerTotal + ty.Theory + ty.Practical) / 3.0;

     	if (total >= 70)
            grade = "A";
        else if (total >= 60)
            grade = "B";
        else if (total >= 50)
            grade = "C";
        else if (total >= 40)
            grade = "Pass Class";
        else
            grade = "FAIL";
     }

     public void display()
     {
     	System.out.println("___________________________________________________");
     	System.out.println("The Roll Number  Is:"+rno);
     	System.out.println("The Name Is  :"+name);
     	sy.display();
     	ty.display();
     	System.out.println("Average Marks In Computer :%.2f\n "+total);
     	System.out.println("The Grade Is :"+grade);



     }


 }





public class Student
{
	public static void main(String[] args)throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


               System.out.print("Enter How Many Student  :");
               int n=Integer.parseInt(br.readLine());

               S1[] std = new S1[n];

               for(int i=0;i<n;i++)
               {   
                     System.out.println("STUDENT  :"+(i+1));
                     
                     System.out.print("Enter The Roll Numnber :");
                     int r= Integer.parseInt(br.readLine());

                     System.out.print("Enter The Name :");
                     String nm = br.readLine();

                     System.out.println("-------------------SY_DETAILS-------------------------");
                     System.out.print("Enter The SY Marks  => Computer Marks :");
                     int a=Integer.parseInt(br.readLine());
 		             System.out.print("Enter The SY Marks  => Maths  Marks  :");
 		             int k=Integer.parseInt(br.readLine());
                     System.out.print("Enter The SY Marks  => Electronics Marks  :");
                     int l=Integer.parseInt(br.readLine());

                     System.out.println("-------------------TY_DETAILS-------------------------");

                     System.out.print("Enter The TY Marks  => Theory Marks :");
                     int t=Integer.parseInt(br.readLine());
 		             System.out.print("Enter The TY Marks  => Practical  Marks  :");
 		             int p=Integer.parseInt(br.readLine());

 		             SYMarks sy = new SYMarks(a,k,l);
                     
                     TYMarks ty = new TYMarks(t,p);

                     std[i]=new S1(r,nm,sy,ty);

               }


               System.out.println("===================SStudentResult=================");

               for(int i=0;i<n;i++)
               {
               	  std[i].display();
               }




		
	}
} 