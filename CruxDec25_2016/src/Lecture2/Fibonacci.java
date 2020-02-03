package Lecture2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Nth Number");
		int n = s.nextInt();
		int a = 0, b = 1, c = 0, i = 0;
		while (n >= i) {
			c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.println(c);
		return;

	}

}
