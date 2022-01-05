package programming;

import java.util.Arrays;

public class CyclicRotateByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Before Rotate :" + Arrays.toString(arr));
        
        rotate(arr);
        
        System.out.println("Rotated Array is " + Arrays.toString(arr));
	}
	
	public static void rotate(int arr[])
	{
		int x = arr[arr.length - 1] , i ;
		for(i=arr.length -1; i > 0 ; i--)
			arr[i] =arr[i-1];
		arr[0] = x;
	}

}
