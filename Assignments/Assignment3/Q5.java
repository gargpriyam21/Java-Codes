package Assignment3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Minimum Value:");
		int m2 = s.nextInt();
		System.out.print("Enter the Maximum Value:");
		int m1 = s.nextInt();
		System.out.print("Enter The Step:");
		int step = s.nextInt();
		int f = 0, c;
		while (f <= m1 && f >= m2) {
			c = (f - 32) * 5 / 9;
			System.out.println(f + "\t" + c);
			f = f + step;

		}
	}
}
