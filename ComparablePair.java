
public class ComparablePair<A extends Comparable,B extends Comparable> implements Comparable<ComparablePair<A,B>>
{

	private A a;
	private B b;
	
	
	public int compareTo(ComparablePair c)
	{
		int compareA = this.a.compareTo(c.a);
		if (compareA != 0) {return compareA;}
		int compareB = this.b.compareTo(c.b);
		return compareB;
	}
}


