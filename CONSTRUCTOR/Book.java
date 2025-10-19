/*Design A Book Class With Member  isbn ,bookname,price,author,publication.Dispaly It [Useing Parameterized Constructor]*/

import java.io.*;

class B1
{
	private int isbn;
	private String bname;
	private String author;
	private String pub;

	 B1(int isbn,String bname,String author,String pub)
	 {
	 	this.isbn=isbn;
	 	this.bname=bname;
	 	this.author=author;
	 	this.pub=pub;

	 }

	 public void dispaly()
	 {
	 	    System.out.println("The Number IS :"+isbn);
        	System.out.println("Book Name  IS :"+bname);
        	System.out.println("Book Author Is"+author);
        	System.out.println("Book Punblication Is "+pub);

	 }
}


public class Book
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How Many Books  :");
		int n=Integer.parseInt(br.readLine());


		B1 B[] = new B1[n];

		for(int i=0;i<n;i++)
		{

            System.out.println("---------------------------------");
            System.out.println("BOOK "+(i+1));

            System.out.print("Enter Book Number  :");
            int n1 =Integer.parseInt(br.readLine());

            System.out.print("Enter The Book Name :");
            String q = br.readLine();

            System.out.print("The Author OF Book(name)  :");
            String r = br.readLine();

            System.out.print("Punblication OF Book  : ");
            String a = br.readLine();

            B[i]= new B1(n1,q,r,a);

            


        }

        for(int i=0;i<n;i++)
        {
        	System.out.println("--------*--*--*--*--*--*--*---------------");
            System.out.println("BOOK Data  "+(i+1));

        	B[i].dispaly();
        }


	}
}
