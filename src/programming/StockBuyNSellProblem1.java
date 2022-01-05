package programming;

public class StockBuyNSellProblem1 {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 8, 12 };
		int n = arr.length;
		System.out.println(maxProfit(arr, 0, n - 1));
	}

	public static int maxProfit(int arr[], int start, int end) {
		int profit = 0;
		if (end <= start)
			return 0;

		for (int i = start; i < end; i++) {
			for (int j = i; j <= end; j++) {
				if (arr[j] > arr[i]) {
					int curr_profit = arr[j] - arr[i] + maxProfit(arr, start, i - 1) + maxProfit(arr, j + 1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}
}
