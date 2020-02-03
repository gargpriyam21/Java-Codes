package Assignment6;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDIOE(5);

	}

	public static void PDIOE(int num) {
		if (num == 0) {
			return;
		}
		if (num % 2 != 0) {
			System.out.println(num);
			PDIOE(num - 1);
		}
		if (num % 2 == 0) {
			PDIOE(num - 1);
			System.out.println(num);
		}
	}

}
