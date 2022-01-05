package programming;

public class CountDigitsTest {

	public static void main(String[] args) {
		
		int number = 1000000000;
		System.out.println(countDigits(number));
	}

	public static int countDigits(int digit)
	{
	  int res = 0;
	  while(digit > 0)
	  {
		  digit = digit /10 ;
		  res++;
	  }		
		return res;
	}
}
