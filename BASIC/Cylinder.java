/*Write a JAVA program to Accept dimensions of a cylinder and print the
surface area and volume. ( surface area = 2πr2 + 2π r h, volume = π r2 h)*/



import java.io.*;

	public class Cylinder
	 {

        public static void main(String args[]) throws Exception

        {

        	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        	System.out.println("Enter The Radius Of Cylinder  :");
        	double r=Float.parseFloat(br.readLine());

        	System.out.Println("Enter The Height Of Cylinder : ");
        	double h=Float.parseFloat(br.readLine());

        	double area=2*(3.14)*r*2+2*(3.14)*r*h;

        	double volume=(3.14)*r*(2*h);

        	System.out.println("The Surface Area Of Cylinder Is  :" + area);

        	System.out.println("The Volume Of Cylinder IS    :" + volume);
        }



	 }