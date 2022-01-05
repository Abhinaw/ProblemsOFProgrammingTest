package programming;

public class FrequenciesInSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {10 ,10,20,30,30,30};
		int n = arr.length;
		printFrequencies(arr, n);
	}

	public static void printFrequencies(int arr[] , int n) {
		
		int freq = 1;
		int i=1;
		
		while(i < n) {
			while(i < n && arr[i] == arr[i -1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i - 1] + " " + freq);
			i++;
			freq = 1;
		}
	}
}
