/*Write a JAVA program to accept three dimensions length (l), breadth(b)and
height(h) of a cuboid and print surface area (surface area=2(lb+lh+bh)) */



import java.io.*; 
	
	public class Cuboid

		{
			public static void main(String args[]) throws Exception

			{

				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


					System.out.println("Enter The Length Of Cuboid   :");
					int l=Integer.parseInt(br.readLine());

					System.out.println("Enter The Breadth(b) Of Cuboid  :");
					int b=Integer.parseInt(br.readLine());

					System.out.println("Enter The Height(h) Of Cuboid  :");
					int h=Integer.parseInt(br.readLine());

					int area=2*(l*b+l*h+b*h);

					System.out.println("The Surfsce area Of Cuboid Is :" + area);
			}
		}