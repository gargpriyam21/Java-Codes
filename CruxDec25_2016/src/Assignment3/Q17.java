package Assignment3;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Take as input a character ch. Write a function that returns ‘U’, if
		// it is uppercase; ‘L’ if it is lowercase and ‘I’ otherwise. Print the
		// value returned.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Character: ");
		char ch = s.next().charAt(0);
		UpperOrLower(ch);

	}

	public static void UpperOrLower(char ch) {
		if (ch >= 97 && ch <= 127) {
			System.out.println("L");
		} else if (ch >= 65 && ch <= 90) {
			System.out.println("U");
		} else {
			System.out.println("I");
		}

	}

}
