package payMoney;

public class PayMoneyservices {
	public void displayResult(int arr[], int target) {
		int n = arr.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];

			if (sum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");

				break;
			}
		}

		if (sum < target) {
			System.out.println(" Given target not acheived");
		}

	}
}
