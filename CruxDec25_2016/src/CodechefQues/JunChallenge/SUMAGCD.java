package CodechefQues.JunChallenge;

import java.util.Scanner;
import java.util.TreeSet;

class SUMAGCD {
	
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int n = 0; n < N; n++) {
			int l = s.nextInt();
			TreeSet<Integer> set = new TreeSet<Integer>();

			for (int i = 0; i < l; i++) {
				set.add(s.nextInt());
			}

			l = set.size();
			Integer[] arr = set.toArray(new Integer[l]);
			System.out.println(Solution(arr, l));
		}
	}

	public static int GCD(int n1, int n2) {
		if (n1 == 0)
			return n2;
		return GCD(n2 % n1, n1);
	}

	public static int getGCD(Integer[] arr, int n, int element) {
		int result = arr[0];
		for (int i = 1; i < n; i++) {
			if (i == element) {
				continue;
			}
			result = GCD(arr[i], result);
		}
		return result;
	}

	public static int Solution(Integer[] arr, int size) {

		if (arr[0] == 1) {
			return (1 + arr[size - 1]);
		}

		if (size == 1) {
			return (2 * arr[0]);
		} else if (size == 2) {
			return (arr[0] + arr[1]);
		} else {
			int mE = 0;
			for (int i = size - 1; i > 0; i--) {
				if ((mE - arr[i]) < arr[0]) {
					int E = arr[i] + getGCD(arr, size, i);
					if (E > mE) {
						mE = E;
					}
				} else {
					break;
				}
			}
			return (mE);
		}
	}
}