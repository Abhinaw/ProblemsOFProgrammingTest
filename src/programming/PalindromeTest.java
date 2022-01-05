package programming;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  isPalindrome("abba");
        isPalindrome("abca");
	}

	static boolean isPalindrome(String str)
	{
		char arr[] = str.toCharArray();
		int h = arr.length -1;
		int l = 0;
		while(h > l)
		{
			if(arr[l++] != arr[h--])
			{
				System.out.println("Not Plaindrome : \n" + arr.toString());
				return false;
			}
		}
		System.out.println("Is Palindrome \n" + arr.toString());
		return true;
	}
}
