/*Accept ‘n’ integers from a command line & print Maximum number from it.*/




import java.io.*;
import java.util.*;

	public class CommandLineMax
	{

			public static void main(String args[])
				{
					System.out.println("Length Of String Is   :" +args.length);//Printing The Length Of Array
					System.out.println("Data Is   :" +Arrays.toString(args));//Printing Data

						
                        
						int max=0;
						int min=Integer.parseInt(args[0]);

						for(int i=0;i<args.length;i++)
						{
							int num =Integer.parseInt(args[i]);//Converting String To Integer
								
									if(num > max)//Maximum logic
									{
										max=num;
									}
									if(num < min)//Minimum logic
									{
										min=num;
									}
						}

						System.out.println("The Maximun Number Is   :"+max);
                        System.out.println("The Minimum Number Is   :"+min);
                       



				}
	}



