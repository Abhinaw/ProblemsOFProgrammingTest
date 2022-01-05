package programming;

import java.util.Arrays;

public class PendulumArrangment {

	public static void main(String[] args) {
		int arr[] = {14,6,19,21,12};
		pendulumArrangment(arr, arr.length);

	}
	
	public static void pendulumArrangment(int arr[] , int n)
	{
		Arrays.sort(arr);
		int ops[] = new int[n];
		int mid = (n-1)/2;
		int i=1,j =1;
		ops[mid] = arr[0];
		for(i =1; i<=mid; i++)
		{
			ops[mid +i] = arr[j++];
			ops[mid -i] = arr[j++];
		}
		if(n%2 == 0)
			ops[mid +i] =arr[j];
		
		System.out.println("Pendulum Arrangment");
		for(i=0; i<n;i++)
			System.out.println(ops[i] + "  ");
		
		System.out.println();
	}

}
