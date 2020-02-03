package Lecture2;

public class PrintPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 50;
		int counter = 2;
		boolean flag = true;
		while (counter <= N) {
			flag = true;
			int divisor = 2;
			while (divisor < counter) {
				if (counter % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}
			if (flag == true) {
				System.out.println(counter);
			}
			counter++;

		}

	}

}
