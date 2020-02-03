package Extras;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Valu Of n");
		int n = s.nextInt();
		int l = 1, i;
		for (i = 1; i <= 5; i++) {
			l = l * i;
		}
		System.out.println(l);
		return;

	}

}
