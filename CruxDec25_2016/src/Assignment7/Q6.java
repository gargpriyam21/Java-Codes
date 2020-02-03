package Assignment7;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeduplicate("hello", "");
	}

	public static void removeduplicate(String str, String ob) {
		if (str.length() == 1) {
			ob = ob + str.charAt(0);
			System.out.println(ob);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (cc == str.charAt(1)) {
			removeduplicate(ros, ob);
		} else {
			removeduplicate(ros, ob + cc);
		}

	}

}
