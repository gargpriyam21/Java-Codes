package Lecture2;

import java.util.Scanner;

public class Sumofoddevenplacedno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		int counter = 1;
		int sumEven = 0;
		int sumOdd = 0;
		while (n != 0) {
			int rem = n % 10;
			if (counter % 2 == 0) {
				sumEven = sumEven + rem;
			} else {
				sumOdd = sumOdd + rem;
			}
			counter++;
			n = n / 10;

		}
		System.out.println("The sum of odd digits is " + sumOdd);
		System.out.println("The sum of even digits is " + sumEven);
	}

}
