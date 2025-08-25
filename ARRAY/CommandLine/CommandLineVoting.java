/*Accept ‘n’ ages(integers) of person from command line & display count of
how many eligible for voting.*/



import java.io.*;
import java.util.*;

	public class CommandLineVoting
		{
			public static void main(String args[])
			{

					System.out.println("Ages Are :   "+Arrays.toString(args));//print Array

					int num=0;

					for(int i=0;i<args.length;i++)
					{

						int	age =Integer.parseInt(args[i]);//Converting String To Integer

					  			if(age >= 18) //logic
					  					{
					  						num++;
					  					}

                     
                     }
					  System.out.println("Eligible For Voting  Is:"+ num);

	        }

	    } 	
		
