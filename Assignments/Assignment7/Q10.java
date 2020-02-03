package Assignment7;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counttwins("AxAxA", 0);
	}

	public static void counttwins(String str, int count) {
		if (str.length() == 2) {
			System.out.println(count);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (cc == str.charAt(2)) {
			counttwins(ros, count + 1);
		} else {
			counttwins(ros, count);
		}

	}

}
