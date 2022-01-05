package programming;

public class LargestElemet {

	public static void main(String[] args) {

		int arr[] = { 10, 40, 30, 89, 456, 258, 32 };
		System.out.println(getLargestElement(arr));

	}

	public static int getLargestElement(int arr[]) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[res]) {
				res = i;
			}
		}
		System.out.println("Largest Elment : " + arr[res]);
		return res;
	}

}
