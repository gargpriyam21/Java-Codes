package Assignment3;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input two numbers N1 and N2. Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
		series(10, 4);

	}

	public static void series(int n1, int n2) {
		int n = 0, i = 0;
		while (n1 != 0) {
			i = (3 * n) + 2;
			if (i % n2 != 0) {
				System.out.println(i);
			}
			n1--;
			n++;
		}
	}

}
