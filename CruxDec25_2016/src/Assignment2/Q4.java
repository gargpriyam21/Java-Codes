package Assignment2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take N as input. Print all prime numbers from 2 to N.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int n = s.nextInt();
		int i = 1, x = 0;
		while (i <= n) {
			x = 0;
			int a = 1;
			while (a <= i) {
				if (i % a == 0) {
					x++;
				}
				a++;
			}
			if (x == 2) {
				System.out.println(i);
			}
			i++;
		}
		return;

	}

}
