package Lecture2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the principal");
		int p = s.nextInt();
		System.out.println("Please Enter the roi");
		int r = s.nextInt();
		System.out.println("Please Enter the time in years");
		int t = s.nextInt();
		int si = (p * r * t) / 100;
		System.out.println("The simple Interest is " + si);

	}

}
