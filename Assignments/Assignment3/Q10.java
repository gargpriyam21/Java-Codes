package Assignment3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input two numbers N1 and N2. Write a function to print all Armstrong numbers between N1 and N2.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Lowest no.:");
		int n1 = s.nextInt();
		System.out.print("Enter The Highest no:");
		int n2 = s.nextInt();
		printArmstrong(n1, n2);
	}

	public static int Armstrongnos(int num) {
		int r = 0, f = 0;
		int s = num;
		while (num != 0) {
			r = num % 10;
			f = f + (r * r * r);
			num = num / 10;
		}
		if (s == f) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void printArmstrong(int start, int end) {
		while (start <= end) {
			if (Armstrongnos(start) == 1) {
				System.out.println(start);
			}
			start++;
		}
	}
}
