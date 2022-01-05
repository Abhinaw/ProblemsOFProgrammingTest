package programming;

public class SubsetSumProblem {

	public static void main(String[] args) {
	
		int n =3, arr[]= {10,20,15}, sum = 25;
		
      System.out.println(countSubsests(arr , n , sum));
	}
	
	public static int countSubsests(int arr[] , int n , int sum)
	{
		if(n==0)
			return sum==0 ? 1 : 0;
		
		return countSubsests(arr, n -1, sum) + countSubsests(arr, n-1, sum - arr[n-1]);
	}

}
