package SY;

public class SYMarks
{
	public int ComputerTotal;
	public int MathsTotal;
	public int ElectronicsTotal;

	public SYMarks(int ComputerTotal,int MathsTotal,int ElectronicsTotal)
	{
		this.ComputerTotal=ComputerTotal;
		this.MathsTotal=MathsTotal;
		this.ElectronicsTotal=ElectronicsTotal;
	}

	public  void display()
	{
     
     System.out.println("_______________________________________________________");


		System.out.println("SY Marks  => Computer :"+ComputerTotal);
		System.out.println("SY Marks  => Maths :"+MathsTotal);
        System.out.println("SY Marks  => Electronics :"+ElectronicsTotal);

	}
}