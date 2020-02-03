package Assignment3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take N (number in octal format). Write a function that converts it to binary format. Print the value returned.
		System.out.println(AnyToAny(25, 8, 2));

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
