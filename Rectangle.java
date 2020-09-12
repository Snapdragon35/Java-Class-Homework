
public class Rectangle implements Printable
{
	private double length;
	private double width;
	
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	public void print()
	{
		System.out.println(length + " " + width);
	}
}
