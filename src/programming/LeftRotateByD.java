package programming;

public class LeftRotateByD {

	public static void main(String[] args) {
		int arr[] = {1 ,2,3,4,5};
		int n = arr.length;
		
		System.out.println("Before Rotate");
        for(int i =0; i<n; i++) {
        	System.out.println(arr[i] + " ");
        }
        
        System.out.println();
        lRotateByD(arr, 2, n);
        
        System.out.println("Afetr Rotate");
        for(int j = 0; j<n; j++) {
        	System.out.println(arr[j] + " ");
        }
	}
	
	public static void lRotateByD(int arr[] , int d , int n) {
		
		int temp[] = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i] = arr[i];
		}
		for(int j =d;j<n;j++) {
			arr[j - d] = arr[j];
		}
		
		for(int k = 0;k<d;k++)
		{
			arr[n - d + 1] = temp[k];
		}
	}

}
