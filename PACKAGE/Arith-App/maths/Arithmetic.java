package maths;

public class Arithmetic
{
	public int x,y;

	public Arithmetic(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public int add()
	{
		return x+y;
	}
	public int sub()
	{
		return x-y;
	}
	public int mul()
	{
		return x*y;
	}	
	public int div()
	{
		return x/y;
	}
}