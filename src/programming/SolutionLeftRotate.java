package programming;

import java.io.IOException;

public class SolutionLeftRotate {

	static boolean checkAlgoOne(int num) {

		boolean check = false;

		String number = Integer.toString(num);
		char[] chars = number.toCharArray();
		int len = chars.length;

		if (num < 0)
			check = false;
		if (num == 0 || num == 1)
			check = true;

		if (len % 2 != 1) {
			check = false;
		} else {

			for (int i = 0; i <= len / 2; i++) {
				if (chars[i] == chars[len - 1])
					check = true;
			}

		}
		return check;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(checkAlgoOne(-121));
	}

}
