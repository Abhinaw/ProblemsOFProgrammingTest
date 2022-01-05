package programming;

public class ReverseArrayTest {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,10};
		printArray(arr, 9);
		reverseArray(arr, 0, 8);
		System.out.println("Reversed Array");
		printArray(arr, 9);
	}

	static void reverseArray(int arr[] , int start , int end)
	{
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void printArray(int arr[] , int size)
	{
		for(int i =0 ; i <size; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}
