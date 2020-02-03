package Assignment3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = s.nextInt();
		System.out.print("Enter The Didgit:");
		int d = s.nextInt();
		System.out.println(NoofDigits(num, d));
	}

	public static int NoofDigits(int num, int d) {
		int r = 0, counter = 0;
		while (num != 0) {
			r = num % 10;
			if (r == d) {
				counter++;
			}
			num = num / 10;
		}
		return counter;
	}

}
