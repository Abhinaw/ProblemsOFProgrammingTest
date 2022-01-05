package programming;

public class ConvertStringToOppsiteCase {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("GeEkSfOrGeEkS");
		System.out.println(str);
		StringToOppositeCase(str);
		System.out.println(str);
	}

	public static void StringToOppositeCase(StringBuffer str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				str.replace(i, i + 1, Character.toUpperCase(c) + "");
			} else {
				str.replace(i, i + 1, Character.toLowerCase(c) + "");
			}
		}
	}

}
