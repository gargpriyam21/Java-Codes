package CodechefQues;

import java.util.Scanner;

class CHHAPPY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int NOTC = s.nextInt();

		for (int i = 0; i < NOTC; i++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = s.nextInt();
			}
			boolean isyes = GetResult(n, arr);
			if (isyes) {
				System.out.println("Truly Happy");
			} else {
				System.out.println("Poor Chef");
			}
		}
	}

	public static boolean GetResult(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] != arr[j]) {
					if (arr[arr[i] - 1] == arr[arr[j] - 1]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
