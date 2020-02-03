package Assignment3;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take as input a number N. Write a function which returns the integral part of square root of the number. Print the value returned.
		System.out.println(Sqrt(4));

	}

	public static int Sqrt(int n) {
		int result = 1, i = 1;
		if (n == 0 || n == 1) {
			return n;
		}
		while (result <= n) {
			if (result == n) {
				return i-1;
			}
			result = i * i;
			i++;
		}
		return (i - 2);

	}

}
