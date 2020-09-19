
public class EfficientArray 
{
	public static void main(String args)
	{
		/*
		 Part a  = O(N)
		 Part b = O(N^2)
		 Part c = O(N)
		 Part d = O(N^2)
		*/
	}
	public static double maxSum(double[] a) //Part a
	{
		double max = Double.MIN_VALUE;
		double max2 =  Double.MIN_VALUE;
		int maxIndex = 0;
		for (int i = 0; i < a.length - 1; i++)
		{
			double placeholder = max;
			max = Math.max(max,a[i]);
			if (placeholder != max)
			{
				maxIndex = i;
			}
		}
		for (int i = 0; i < a.length - 1; i++)
		{
			if (i == maxIndex) 
			{
				continue;
			}
			max2 = Math.max(max2, a[i]);
		}
		return max + max2;
	}
	public static double maxDifference(double[] a) //Part b
	{
		double max = Double.MIN_VALUE;
		for (int i = a.length - 1; i > 0; i--)
		{
			for (int j = i - 1; j <= 0; j--)
			{
				max = Math.max(a[i] - a[j], max);
			}
		}
		return max;
	}
	public static double maxProduct(double[] a) //Part c
	{
		double max = Double.MIN_VALUE;
		double max2 =  Double.MIN_VALUE;
		double min = Double.MIN_VALUE;
		double min2 = Double.MAX_VALUE;
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < a.length - 1; i++)
		{
			double placeholder = max;
			double placeholder2 = min;
			max = Math.max(max,a[i]);
			min = Math.min(min,a[i]);
			if (placeholder != max)  {maxIndex = i;}
			if (placeholder2 != min) {minIndex = i;}
		}
		for (int i = 0; i < a.length - 1; i++)
		{
			if (i != maxIndex) 
			{
				max2 = Math.max(max2,a[i]);
			}
			if (i != minIndex)
			{
				min2 = Math.min(min2,a[i]);
			}
		}

		return Math.max(max * max2, min * min2);
	}
	public static double maxQuotient(double[] a) //Part d
	{
		double max = Double.MIN_VALUE;
		for (int i = a.length - 1; i > 0; i--)
		{
			for (int j = i - 1; j <= 0; j--)
			{
				max = Math.max(a[i]/a[j], max);
			}
		}
		return max;
	}
}
