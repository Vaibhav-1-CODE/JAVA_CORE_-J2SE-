import java.io.*;
import maths.Arithmetic;

public class App
{
	public static void main(String[] args)throws Exception 
	{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.print("Enter The First Number :");
       int x=Integer.parseInt(br.readLine());

       System.out.print("Enter The Second Number :");
       int  y=Integer.parseInt(br.readLine());
       

       Arithmetic ob =new Arithmetic(x,y);

       int sum = ob.add();

       int sub = ob.sub();

       int mul = ob.mul();

       int div = ob.div();

       System.out.println("----------------RUSULT-----------------");
       System.out.println("The Addition Of Two Number Is :"+sum);
       System.out.println("The Subteaction Of Two Number Is :"+sub);	
       System.out.println("The Multipilcation Of Two Number Is :"+mul);
       System.out.println("The Division Of Two Number Is :"+div);		
	}
}