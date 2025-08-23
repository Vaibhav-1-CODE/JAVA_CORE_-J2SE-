/*Store 'n' elements in an Array, Print its sum*/




import java.io.*;

	public class Sum 
		{
			public static void main(String args[]) throws Exception 
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    
                    	  System.out.print("How Many Number You Want To Store  :");
                    	  int n=Integer.parseInt(br.readLine());//Accepting n numbers

                    	  	int a[] = new int[n];//create a Array

                    	  	for(int i=0;i<a.length;i++)//Logic For Storing Values
                    	  	{


                    	  		System.out.print("Enter The Number  :");
                    	  		 a[i]=Integer.parseInt(br.readLine());
                    	  	}

                    	  	int ans=0;

                    	  	for(int i=0;i<a.length;i++)//Logic For Addition
                    	  	{
                    	  		ans=ans+a[i];
                    	  	}
                    	  System.out.println("Sum Of Given Numbers Is  :" +ans);




				}
		}