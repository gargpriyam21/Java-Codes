package Assignment2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take N as input. Print Nth Fibonacci number. 0 is the 0th Fibonacci number and 1 is 1st Fibonacci number.
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter th Nth Number");
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
