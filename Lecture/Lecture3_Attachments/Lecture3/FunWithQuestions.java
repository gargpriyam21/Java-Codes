package Lecture3;

public class FunWithQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 100000;
		System.out.println(BinToDec(bin));
		System.out.println(DecToBin(32));
		System.out.println(AnyToDec(31, 8));
		System.out.println(DecToAny(25, 8));
		System.out.println(AnyToAny(25, 8, 2));
		System.out.println(gcd(18, 24));
		System.out.println(lcm(24, 18));
		System.out.println(log(1024, 2));
		System.out.println(Power(2, 5));

	}

	public static int BinToDec(int bin) {
		int dec = 0, twoPowers = 1;
		while (bin != 0) {
			int rem = bin % 10;
			dec = dec + rem * twoPowers;
			twoPowers = twoPowers * 2;
			bin = bin / 10;

		}

		return dec;
	}

	public static int DecToBin(int dec) {
		int bin = 0, tenPowers = 1;
		while (dec != 0) {
			int rem = dec % 2;
			bin = bin + tenPowers * rem;
			tenPowers = tenPowers * 10;
			dec = dec / 2;
		}
		return bin;
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

	public static int gcd(int num1, int num2) {
		int dividend = num1 > num2 ? num1 : num2;
		int divisor = num1 < num2 ? num1 : num2;

		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			int oldDiv = divisor;
			divisor = rem;
			dividend = oldDiv;

		}
		return divisor;

	}

	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}

	public static int log(int x, int n) {
		int counter = 0;
		while (x != 1) {
			counter++;
			x = x / n;
		}
		return counter;
	}

	public static int Power(int x, int n) {
		int retVal = 1;
		while (n != 0) {
			retVal = retVal * x;
			n--;
		}
		return retVal;

	}

}
