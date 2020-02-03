package CodechefQues.JunChallenge;

import java.util.Scanner;

public class RSIGN {

	static int val = 1000000007;

	public static long func2(int a, long pow) {
		if (pow == 0)
			return 1;
		long y = func2(a, pow / 2);

		if (pow % 2 == 0) {
			y = (y * y) % val;
			return y;
		} else {
			y = (y * y * a) % val;
			return y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int tt = s.nextInt();

		for (int i = 0; i < tt; i++) {

			long n = s.nextLong();

			long finalx = ((5 % val) * (func2(2, n) % val)) % val;
			System.out.println(finalx);
		}
	}
	
	// ANS IN C++
	
//	#include<iostream>
//	using namespace std;
//
//	long power(int a, long pow) {
//		if (pow == 0)
//			return 1;
//		long y = power(a, pow / 2);
//
//		if (pow % 2 == 0) {
//			y = (y * y) % 1000000007;
//			return y;
//		} else {
//			y = (y * y * a) % 1000000007;
//			return y;
//		}
//	}
//
//	int main() {
//
//		int N;
//		cin >> N;
//
//		for (int n = 0; n < N; n++) {
//			long num;
//			cin >> num;
//			long result = ((5 % 1000000007) * (power(2, num) % 1000000007)) % 1000000007;
//			cout << result << endl;
//		}
//	}

}
