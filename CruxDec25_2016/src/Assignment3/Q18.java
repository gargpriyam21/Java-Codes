package Assignment3;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1 = s.nextInt();
		System.out.println("Enter the character: ");
		char ch = s.next().charAt(0);
		System.out.println("Enter the number: ");
		int n2 = s.nextInt();
		System.out.println(Calculator(ch, n1, n2));

	}

	public static int Calculator(char c, int n1, int n2) {
		int i = 0;
		if (c == '+') {
			i = n1 + n2;
			return i;
		} else if (c == '-') {
			i = n1 - n2;
			return i;
		} else if (c == '*') {
			i = n1 * n2;
			return i;
		} else if (c == '/') {
			i = n1 / n2;
			return i;
		} else if (c == 'x' || c == 'X') {
			return 0;
		}
		return 1;
		
	}

}
