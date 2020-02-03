package Assignment3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	      
	      int N = scn.nextInt();
	      
	      System.out.println(isMirrorInverse(N));
	}

	public static boolean isMirrorInverse(int n) {
		int chk = n;
		int f = Inverse(n);
		if (chk == f) {
			return true;
		} else {
			return false;
		}
	}

	public static int Inverse(int n) {
		int tenPowers = 1, r = 0, rem = 0, count = 1;
		while (n != 0) {
			tenPowers = 1;
			r = n % 10;
			for (int i = 0; i < r - 1; i++) {
				tenPowers = tenPowers * 10;
			}
			rem = count * tenPowers + rem;
			n = n / 10;
			count++;
		}
		return rem;
	}

}
