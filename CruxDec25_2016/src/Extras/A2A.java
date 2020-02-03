package Extras;

import java.util.Scanner;

public class A2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		int dn = any2Any(sb, db, sn);
		System.out.println(dn);
	}

	public static int any2Dec(int num, int base) {
		int retVal = 0;

		/* Write your code here */
		if (base == 2) {
			int twoPowers = 1, rem;
			while (num != 0) {
				rem = num % 10;
				retVal = retVal + rem * twoPowers;
				twoPowers = twoPowers * 2;
				num = num / 10;
			}
		}
		if (base == 8) {
			int eightPowers = 1, rem;
			while (num != 0) {
				rem = num % 10;
				retVal = retVal + rem * eightPowers;
				eightPowers = eightPowers * 8;
				num = num / 10;
			}
		}
		if (base == 10) {
			retVal = num;
		}

		return retVal;
	}

	public static int dec2Any(int num, int base) {
		int retVal = 0;

		/* Write your code here */
		if (base == 2) {
			int tenPowers = 1, rem;
			while (num != 0) {
				rem = num % 2;
				retVal = retVal + tenPowers * rem;
				tenPowers = tenPowers * 10;
				num = num / 2;
			}
		}
		if (base == 8) {
			int tenPowers = 1, rem;
			while (num != 0) {
				rem = num % 8;
				retVal = retVal + tenPowers * rem;
				tenPowers = tenPowers * 10;
				num = num / 8;
			}
		}
		if (base == 10) {
			retVal = num;
		}

		return retVal;
	}

	public static int any2Any(int from, int to, int num) {
		int retVal = 0;

		/* Write your code here. You may cal the above two functions */
		int dec = any2Dec(num, from);
		retVal = dec2Any(dec, to);
		return retVal;
	}

}
