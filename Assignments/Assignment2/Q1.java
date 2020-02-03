package Assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		//Take N as input. If the number is prime, print “Prime” otherwise print “Not Prime”.
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = s.nextInt();
		int divisor = 2;
		while (divisor < n) {
			if (n % divisor == 0) {
				System.out.println("NOT PRIME");
				return;
			}
			divisor++;
		}
		System.out.println("PRIME");
		return;

	}

}
