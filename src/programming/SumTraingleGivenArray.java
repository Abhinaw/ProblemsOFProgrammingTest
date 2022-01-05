package programming;

public class SumTraingleGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void printTraingle(int n)
	{
		int arr[] = new int[n];
		int tri[][] = new int[n][n];
		
		for(int i=0; i < n ; i++)
			tri[n-1][i] = arr[i];
		
	}
}
