package Assignment8a;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lexico(1000, 0);
	}

	public static void lexico(int end, int curr) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		if (curr == 0) {
			for (int i = 1; i < 10; i++) {
				lexico(end, curr * 10 + i);
			}
			return;
		} else {
			for (int i = 0; i < 10; i++) {
				lexico(end, curr * 10 + i);
			}
			return;
		}
	}

}
