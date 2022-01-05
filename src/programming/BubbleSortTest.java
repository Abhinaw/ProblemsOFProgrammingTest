package programming;

public class BubbleSortTest {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 4, 3 };
		bubbleSort(arr, 4);
		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i] + " ");
		}
		/////////////////////////////////////
		/*
		 * int arr[] = { 2, 1, 4, 3 }; efficeintBubbleSort(arr, 4); for (int i = 0; i <
		 * 4; i++) { System.out.println(arr[i] + " "); }
		 */
	}

	public static void bubbleSort(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swapping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void efficeintBubbleSort(int arr[], int n) {
		boolean swapped;
		
		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swapping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}
	}
}
