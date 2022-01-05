package programming;

public class MaximumNoOfPieces {

	public static void main(String[] args) {
		
      System.out.println(findMaximumPieces(3));
	}
	
	public static int findMaximumPieces(int n)
	{
	    int x = n/2;
		return ((x + 1) * (n - x + 1));  // no = (horizontalcut + 1) * (verticalcut +1)
	}

}
