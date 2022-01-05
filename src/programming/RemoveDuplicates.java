package programming;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 30, 30, 40, 50, 40 };
		System.out.println("Before Removal");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int n = remDups(arr);
		System.out.println("After Removal");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static int remDups(int arr[]) {
		int res = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[res] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}
}
