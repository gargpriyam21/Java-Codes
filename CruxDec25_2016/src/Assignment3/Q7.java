package Assignment3;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inverse(12345);
	}

	public static void Inverse(int n) {
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
		System.out.println(rem);

	}

}
