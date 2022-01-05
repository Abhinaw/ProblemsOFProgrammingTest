package programming;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		
		int arr[] = {0,10,20,0,30,0};
		int n = arr.length;
		moveZeros(arr, n);
		System.out.println(arr.toString());

	}

	public static void moveZeros(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				swap(arr[i], arr[count]);
				count++;
			}
		}

	}

	private static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

}
