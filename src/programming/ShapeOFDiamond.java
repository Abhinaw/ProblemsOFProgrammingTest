package programming;

public class ShapeOFDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printDiamond(5);
	}
	
	public static void printDiamond(int n)
	{
		int space = n -1;
		for(int i = 0 ; i< n; i++)
		{
			for(int j =0; j<space; j++)
				System.out.println(" ");
			
			for(int k =0; k <=i; k++)
				System.out.println("*");
			
			System.out.println("\n");
			space--;
		}
		space = 0;
		for(int a = n; a > 0; a--)
		{
			for(int b =0; b<space;b++)
				System.out.println(" ");
			
			for(int c=0; c <a; c++)
				System.out.println("*");
			
			System.out.println("\n");
			space ++;
		}
	}

}
