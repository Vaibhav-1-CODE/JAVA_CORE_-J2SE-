/*Design A Book Class With Member  isbn ,bookname,price,author,publication[Setter & getter]*/

import java.io.*;

class B1
{
	private int isbn;
	private String bname;
	private String author;
	private String pub;

	public void setIsbn(int isbn)
	{
		this.isbn=isbn;

	}

	public int getIsbn()
	{
		return isbn;
	}

	public void setBname(String bname)
	{
		this.bname=bname;
	}

	public String getBname()
	{
		return bname;
	}

	public void setAuthor(String author)
	{
		this.author=author;
	}

	public String getAuthor()
	{
		return author;
	}
	public void setPub(String pub)
	{
		this.pub=pub;
	}
	public String getPub()
	{
		return pub;
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

            B[i]= new B1();

            B[i].setIsbn(n1);
            B[i].setBname(q);
            B[i].setAuthor(r);
            B[i].setPub(a);


        }

        for(int i=0;i<n;i++)
        {
        	System.out.println("--------*--*--*--*--*--*--*---------------");
            System.out.println("BOOK Data  "+(i+1));

        	System.out.println("The Number IS :"+B[i].getIsbn());
        	System.out.println("Book Name  IS :"+B[i].getBname());
        	System.out.println("Book Author Is"+B[i].getAuthor());
        	System.out.println("Book Punblication Is "+B[i].getPub());

        }


	}
}
