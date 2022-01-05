package programming;

public class LeftRotateByOne {

	public static void main(String[] args) {
		
		int arr[] = {1 ,2,3,4,5,6};
		int n = arr.length;
		
		System.out.println("Before Rotate");
        for(int i =0; i<n; i++) {
        	System.out.println(arr[i] + " ");
        }
        
        System.out.println();
        lRotate(arr, n);
        
        System.out.println("Afetr Rotate");
        for(int j = 0; j<n; j++) {
        	System.out.println(arr[j] + " ");
        }
	}

	public static void lRotate(int arr[], int n) {
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}
}
