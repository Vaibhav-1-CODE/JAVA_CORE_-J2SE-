/*Define a class MyNumber having one private int data member. Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods
isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. Use command line
arguments to pass a value to the object (Hint : convert string argument to integer) and perform the
above tests. Provide javadoc comments for all constructors and methods and generate the html
help file.*/

import java.io.*;

public class MyNumber
{
	private int num;


  //Default constructor that initializes num to 0.
	MyNumber()
	{
		this.num=0;
	}


 //Parameterized constructor that initializes num to the given value. 
	MyNumber(int num)
	{
		this.num=num;
	}

    // Check For Negative
    public boolean isNegative()
    {
       return num < 0;

    }
        // Check For Positive
    public boolean isPositive()
    {
    	return num > 0;

    }
    
       // Check For Zero
    public boolean isZero()
    {
        return num ==0;
    }
     
       //Check For Odd 
    public boolean isOdd()
    {
         return num % 2 !=0;
    }
    
       //Check For Even
     public boolean isEven()
     {
         return num % 2 == 0;
     }

       //The main method creates an object of MyNumber using a command-line argument
       

	public static void main(String[] args) 
	{

		if(args.length==0)
		{
			System.out.print("Give A CommandLine Argument");
			return;
		}
		
		
		 // Convert string argument to integer
		 int value = Integer.parseInt(args[0]);

           // Create MyNumber object
          MyNumber number = new MyNumber(value);

           // Perform and display tests
          System.out.println("Number : "+value);
          System.out.println("Is Positive :"+number.isPositive());
          System.out.println("Is Negative :"+number.isNegative());
          System.out.println("Is zero     :"+number.isZero());
          System.out.println("IS Odd      :"+number.isOdd());
          System.out.println("Is Even     :"+number.isEven());
	}
}