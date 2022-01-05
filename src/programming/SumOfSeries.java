package programming;

public class SumOfSeries {

	public static void main(String[] args) {
      System.out.println(calculateSum(4));
	}
	
	public static int calculateSum(int n)
	{
		//Sn = n*(4*n*n + 6*n -1)/3
		return (n*(4*n*n + 6*n -1)/3);
	}

}
