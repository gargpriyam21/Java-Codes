package Assignment7;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertstar("hello", "");

	}

	public static void insertstar(String str, String ob) {
		if (str.length() == 1) {
			ob = ob + str.charAt(0);
			System.out.println(ob);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (cc == str.charAt(1)) {
			insertstar(ros, ob + cc + '*');
		} else {
			insertstar(ros, ob + cc);
		}

	}

}
