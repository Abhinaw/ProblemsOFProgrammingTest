package programming;

import java.util.ArrayList;

public class StringPanagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps " + "over the dog";
		ArrayList<Character> missing = missingChars(str);
		if (missing.size() >= 1) {
			for (Character character : missing) {
				System.out.print(character);
			}
		}
	}

	public static ArrayList<Character> missingChars(String str) {
		int MAX_CHARS = 26;
		ArrayList<Character> charsList = new ArrayList<>();
		boolean[] present = new boolean[MAX_CHARS];
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) &&
	                   str.charAt(i) <= 'Z')
	            present[str.charAt(i) - 'A'] = true;
	        else if ('a' <= str.charAt(i) &&
	                        str.charAt(i) <= 'z')
	            present[str.charAt(i) - 'a'] = true;
		}

		for (int j = 0; j < MAX_CHARS; j++) {
			if (present[j] == false) {
				charsList.add((char) (j + 'a'));
			}
		}
		return charsList;

	}

}
