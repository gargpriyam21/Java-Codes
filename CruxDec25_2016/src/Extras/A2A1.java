package Extras;

public class A2A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AnyToAny(25, 8, 2));

	}

	public static int AnyToDec(int num, int sb) {
		int dec = 0, sbPowers = 1;
		while (num != 0) {
			int rem = num % 10;
			dec = dec + rem * sbPowers;
			sbPowers = sbPowers * sb;
			num = num / 10;

		}

		return dec;
	}

	public static int DecToAny(int dec, int db) {
		int num = 0, tenPowers = 1;
		while (dec != 0) {
			int rem = dec % db;
			num = num + tenPowers * rem;
			tenPowers = tenPowers * 10;
			dec = dec / db;
		}
		return num;
	}

	public static int AnyToAny(int num, int sb, int db) {
		int dec = AnyToDec(num, sb);
		int retVal = DecToAny(dec, db);
		return retVal;
	}

}
