package payMoney;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter the total number of target that needs to be achieved");
		int targetNo = sc.nextInt();
		System.out.println();
		for (int i = 0; i < targetNo; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			PayMoneyservices obj = new PayMoneyservices();
			obj.displayResult(arr, target);
		}

	}

}
