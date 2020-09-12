
public class Person implements Printable
{
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public Person(String f, String l, int y)
	{
		firstName = f;
		lastName = l;
		yearOfBirth = y;
	}
	public void print()
	{
		System.out.println(firstName + " " + lastName + " " + yearOfBirth);
	}
}
