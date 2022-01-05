package programming;

public class SumOfDigitTest {

	public static void main(String[] args) {
		
		int sum = 12;
		System.out.println(getSum(sum));
	}
	
	static int getSum(int n)
	{
		int sum = 0;
		while(n !=0)
		{
			sum = sum + n%10;
			n = n/10;
		}
		return sum;
	}

}
