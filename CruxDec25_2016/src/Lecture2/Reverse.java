package Lecture2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = s.nextInt();
		int r = 0;
		int i = 0;
		while (n != 0) {
			r = n % 10;
			i = i * 10 + r;
			n = n / 10;
		}
		System.out.println(i);
		return;

	}

}
