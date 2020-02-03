package Assignment3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input a number. Write a functions which returns true if the number is Armstrong number and false otherwise. Print the value returned.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = s.nextInt();
		Armstrong(n);
	}

	public static void Armstrong(int n) {
		int r = 0, i = 0;
		int f = n;
		while (n != 0) {
			r = n % 10;
			i = i + (r * r * r);
			n = n / 10;
		}
		if (i == f) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
