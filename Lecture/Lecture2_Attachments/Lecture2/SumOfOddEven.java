package Lecture2;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 76453;
		int counter = 1;
		int sumEven = 0;
		int sumOdd = 0;
		while (N != 0) {
			int rem = N % 10;
			if (counter % 2 == 0) {
				sumEven = sumEven + rem;
			} else {
				sumOdd = sumOdd + rem;
			}
			counter++;
			N = N / 10;

		}
		System.out.println("The sum of Odd Digits is " + sumOdd);
		System.out.println("The sum of Even Digits is " + sumEven);

	}

}
