package programming;

public class FirstOccrInSortedArray {

	public static void main(String[] args) {

		int arr[] = {5,10,10,15,20,20,20} , n = 7;
		int x = 20;
		System.out.println(firstOccr(arr, 0, n -1, x));
	}
	
	static int firstOccr(int arr[] , int low , int high , int x) {
		if(low > high)
			return -1;
		
		int mid = (low + high)/2;
		if(x > arr[mid])
			return firstOccr(arr, mid + 1, high, x);
		
		else if(x < arr[mid])
			return firstOccr(arr, low, mid -1, x);
			
		else {
			
			if(mid == 0 || arr[mid -1]!=arr[mid])
				return mid;
			else
				return firstOccr(arr, low, mid -1, x);
				
		}			
	}

}
