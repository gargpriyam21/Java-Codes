package Assignment2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take N as input. Print all Fibonacci numbers less than N.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Valu Of n");
		int n = s.nextInt();
		int a = 0, b = 1, c = 0;
		System.out.println(a);
		System.out.println(b);
		while (n > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			n--;
		}
		return;

	}

}
