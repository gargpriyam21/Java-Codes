package Lecture2;

public class SumOfFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		int counter = 1, sum = 0;
		while (counter <= N) {
			sum = sum + counter;
			counter++;
		}
		System.out.println("The sum is " + sum);

	}

}
