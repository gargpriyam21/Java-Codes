package Assignment3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number in octal form");
		int n=s.nextInt();
		System.out.println(AnyToAny(n, 8, 2));

	}
	public static int AnyToDec(int num, int db) {
		int dec = 0;
		if (db == 2) {
			int twoPowers = 1, rem;
			while (num != 0) {
				rem = num % 10;
				dec = dec + rem * twoPowers;
				twoPowers = twoPowers * 2;
				num = num / 10;
			}
		} else if (db == 8) {
			int eightPowers = 1, rem;
			while (num != 0) {
				rem = num % 10;
				dec = dec + rem * eightPowers;
				eightPowers = eightPowers * 8;
				num = num / 10;
			}
		}
		return dec;
	}

	public static int DecToAny(int num, int sb) {
		int Bin = 0;
		if (sb == 2) {
			int tenPowers = 1, rem;
			while (num != 0) {
				rem = num % 2;
				Bin = Bin + tenPowers * rem;
				tenPowers = tenPowers * 10;
				num = num / 2;
			}
		} else if (sb == 8) {
			int tenPowers = 1, rem;
			while (num != 0) {
				rem = num % 8;
				Bin = Bin + tenPowers * rem;
				tenPowers = tenPowers * 10;
				num = num / 8;
			}
		}
		return Bin;
	}

	public static int AnyToAny(int num, int sb, int db) {
		int dec = AnyToDec(num, sb);
		int retVal = DecToAny(dec, db);
		return retVal;
	}

}
