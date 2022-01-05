package programming;

public class SumOfArrayElementTest {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
        sum(arr);
	}

	static int sum(int arr[])
	{
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum is \n" + sum);
		
		return sum;
	}
	
}
