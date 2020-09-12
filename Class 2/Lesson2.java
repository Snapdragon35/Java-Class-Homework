
public class Lesson2 
{
	public static void main(String[] args)
	{
		Person p = new Person("Bryan","Zhang",2005);
		p.print();
		Rectangle[] shapes = {new Rectangle(3,4), new Rectangle(6,5)};
		printAll(shapes);
	}
	
	public static <T extends Printable> void printAll(T[] array) 
	{
		for (T obj : array)
		{
			
			obj.print();
		}
	}
}
