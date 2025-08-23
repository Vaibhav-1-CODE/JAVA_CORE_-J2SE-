/* Accept 'n' integr number from commandline , Print its sum*/




import java.io.*;
import java.util.Arrays;

	public class CommandLine
		{
			public static void main(String args[]) 
			{

				System.out.println("String Is :" + args.length);

				System.out.println("Command Line Stirngs Is :"+Arrays.toString(args));

					int ans=0;

					for(int i=0;i<args.length;i++)
					{
						ans=ans+Integer.parseInt(args[i]);
					}

				System.out.println("Addition Is :" +ans);
			}
		}