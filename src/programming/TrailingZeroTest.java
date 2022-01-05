package programming;

public class TrailingZeroTest {

	public static void main(String[] args) {
		int no = 251;
		System.out.println(countTrailing(no));

	}

	public static int countTrailing(int n) {

		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + (n / i);
		}
		return res;
	}

}
