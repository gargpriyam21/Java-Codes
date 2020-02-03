package Lecture2;

public class CheckGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int c = 30;
		if (a >= b && a >= c) {
			System.out.println("A is greater");
			return;
		}
		if (b >= a && b >= c) {
			System.out.println("B is greater");
			return;
		}
		System.out.println("C is greater");

	}

}
