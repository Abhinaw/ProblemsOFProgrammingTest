package programming;

public class SelectionSortTest {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 3 };
		selectionSort(arr, 4);
		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void selectionSort(int arr[], int n) {

		for (int i = 0; i < n; i++) {

			int min_ind = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
		}

	}

}
