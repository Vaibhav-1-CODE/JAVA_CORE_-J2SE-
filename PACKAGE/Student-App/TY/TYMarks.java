

package TY;

public class TYMarks
{
	public int Theory;
	public int Practical;

	public TYMarks(int Theory,int Practical)
	{
		this.Theory=Theory;
		this.Practical=Practical;
	}

	public void display()
	{ 
		System.out.println("---------------------------------------");

		System.out.println("TY Marks  => Theory :"+Theory);
        System.out.println("TY Marks  => Practical :"+Practical);

	}

}