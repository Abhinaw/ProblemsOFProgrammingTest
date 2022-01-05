package programming;

public class SecondLargestElement {

	public static void main(String[] args) {

		int arr[] = { 10, 40, 30, 89, 456, 258, 32 };
		System.out.println(secondLargest(arr));
	}

	public static int secondLargest(int arr[]) {
		int n = arr.length;
		int largest = 0;
		int res = -1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if (res == -1 || arr[i] > arr[res])
					res = i;
			}
		}
		return res;
	}
}
