/*Define a Student class (roll number, name, percentage). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor and
display the object count after each object is created. (Use static member and method). Also
display the contents of each object.*/




import java.io.*;

public class Student 
{
    
    private int rno;
    private String name;
    private double per;



    //Static variable to keep count of objects created */
    private static int count =0;

   //Default Constructor
    Student()
    {
    	rno=0;
    	name="unkown";
    	per=0.0;
    	count++;
    }

    // Paramerterized Constructor
     Student(int rno,String name,double per)
     {
     	this.rno=rno;
     	this.name=name;
     	this.per=per;
     	count++;
     }

    //Static method to return the total number of Student objects created.
     public static int getObjectCount()
     {
     	return count;
     }

       //Display Method(Data Of Student)
     public void dispaly()
     {
     	System.out.println("The Roll Number Is :"+rno);
     	System.out.println("The Name Is        :"+name);
     	System.out.println("The Percentage Is  :"+per);
     }

	public static void main(String[] args) 
	{
        
        Student s1 = new Student(111,"Ram",99.9);
        System.out.println("After Creating 1st Object,Total Stusents :"+Student.getObjectCount());
        s1.dispaly();
        System.out.println("-----------------------------------------------------------------------");

        Student s2 = new Student(333,"Ajinkya",91.9);
        System.out.println("After Creating 2st Object,Total Stusents :"+Student.getObjectCount());
        s2.dispaly();
        System.out.println("-----------------------------------------------------------------------");
        
        Student s3 = new Student(999,"Ram",96.6);
        System.out.println("After Creating 3st Object,Total Stusents :"+Student.getObjectCount());
        s3.dispaly();
        System.out.println("-----------------------------------------------------------------------");

	}
}