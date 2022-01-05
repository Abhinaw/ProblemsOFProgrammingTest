package programming;

public class GenerateSubsets {

	public static void main(String[] args) {
		printSubsets("ABC", "", 0);
	}
	
	public static void printSubsets(String str ,String curr, int index)
	{
		if(index == str.length())
		{
			System.out.println(curr + " ");
			return ;
		}
		printSubsets(str,curr, index + 1);
		printSubsets(str,curr + str.charAt(index), index + 1);
	}

}
