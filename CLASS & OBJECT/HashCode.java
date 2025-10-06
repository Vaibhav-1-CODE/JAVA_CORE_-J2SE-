/*Reference And Hash Code Of Variable I & J*/

import java.io.*;
 class A
 {
 	int i;
 	int j;

 	public void dispaly()
 	{
 		System.out.println("Hello World");
 		System.out.println("Valur Of I :"+i);
 		System.out.println("Value Of J :"+j);
 	}
 }

 public class HashCode
  {
    
      public static void main(String args[])
      {

  	 	A ob =new A();
  	 	ob.dispaly();

  	 	System.out.println("Reference :"+ ob);
  	 	System.out.println("Hash Code :"+ob.hashCode());
  	 }
  }
 	
 