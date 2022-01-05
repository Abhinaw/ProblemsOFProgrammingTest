package programming;

public class FactorialTest {

	public static void main(String[] args) {
		int number = 5;

		System.out.println(Fact(number));
	}
	
	public static int Fact(int n)
	{
		if(n ==0) 
		return 1;
			
		return n * Fact(n-1);
	}

}
