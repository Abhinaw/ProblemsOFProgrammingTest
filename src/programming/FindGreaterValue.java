package programming;

public class FindGreaterValue {

	public static void main(String[] args) {
		findGreater(12, 24, 5);   // a^n and b^n who is grater 

	}

	public static void findGreater(int a , int b , int n)
	{
		if(!((n & 1) > 0))
		{
			a = Math.abs(a);
			b = Math.abs(b);
		}
		if(a==b)
		{
			System.out.println("a^n =b^n");
		}
		else if(a > b)
		{
			System.out.println("a^n greater than b^n");
		}
		else
		{
			System.out.println("b^n greater than a^n");
		}
	}
}
