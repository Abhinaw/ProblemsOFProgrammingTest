package programming;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		//isPalindrome("abba");
	   // isPalindrome("abbccbba");
	    isPalindrome("geeks");
	}

	public static void isPalindrome(String str) {
		int l = 0;
		int h = str.length() - 1;
		while (h > l) {
			if (str.charAt(l++) != str.charAt(h--)) {
				System.out.println("Not Palindrome");
			} else {
				System.out.println("Palindrome");
			}
		}
	}
}
