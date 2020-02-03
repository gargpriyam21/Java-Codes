package Lecture3;

public class NumOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 100000, Dec = 32;
		System.out.println(BinToDec(bin));
		System.out.println(DecToBin(Dec));
		System.out.println(AnyToDec(63, 8));
		System.out.println(DecToAny(63, 8));
		System.out.println(AnyToAny(25, 8, 2));
		System.out.println(GCD(18, 24));
		System.out.println(LCM(18, 24));
		System.out.println(power(5, 2));
		System.out.println(log(25, 5));

	}

	public static int BinToDec(int bin) {
		int twoPowers = 1, rem, dec = 0;
		while (bin != 0) {
			rem = bin % 10;
			dec = dec + rem * twoPowers;
			twoPowers = twoPowers * 2;
			bin = bin / 10;
		}
		return dec;
	}

	public static int DecToBin(int Dec) {
		int Bin = 0, tenPowers = 1, rem;
		while (Dec != 0) {
			rem = Dec % 2;
			Bin = Bin + tenPowers * rem;
			tenPowers = tenPowers * 10;
			Dec = Dec / 2;

		}
		return Bin;
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

	public static int GCD(int n1, int n2) {
		int dividend = n1 > n2 ? n1 : n2;
		int divisor = n1 < n2 ? n1 : n2;
		int rem = 0;
		while (dividend % divisor != 0) {
			rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}

	public static int LCM(int n1, int n2) {
		int lcm;
		int gcd = GCD(n1, n2);
		lcm = (n1 * n2) / gcd;
		return lcm;
	}

	public static int power(int x, int n) {
		int z = 1;
		while (n > 0) {
			z = z * x;
			n--;
		}
		return z;
	}

	public static int log(int x, int n) {
		int counter = 0;
		while (x != 1) {
			counter++;
			x = x / n;
		}
		return counter;
	}
}
