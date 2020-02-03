package Assignment3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take N (number in binary format). Write a function that converts it to decimal format. Print the value returned.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The No.in Binary Format");
		int n=s.nextInt();
		System.out.println(BinToDec(n));

	}
	public static int BinToDec(int bin) {
		int twoPowers = 1, rem, dec = 0;
		while (bin != 0) {
			rem = bin % 10;
			dec = dec + rem * twoPowers;
			twoPowers = twoPowers * 2;
			bin = bin / 10;
		}
		return dec;
	}

}
