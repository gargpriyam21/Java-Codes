package Assignment3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The No.in Decimal Format");
		int n=s.nextInt();
		System.out.println(DecToOct(n));

	}
	public static int DecToOct(int num){
		int tenPowers = 1, rem;
		int Bin=0;
		while (num != 0) {
			rem = num % 8;
			Bin = Bin + tenPowers * rem;
			tenPowers = tenPowers * 10;
			num = num / 8;
		}
		return Bin;
	}

}
