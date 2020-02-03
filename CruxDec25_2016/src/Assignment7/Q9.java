package Assignment7;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q9A*******************");
		System.out.println(countshi("hihithihit"));
		System.out.println("*******************Q9B*******************");
		removeshi("hihithihit", "");
		System.out.println("*******************Q9C*******************");
		hitobye("hihithihit", "");
	}

	public static int countshi(String str) {
		if (str.length() < 3) {
			return 0;
		}

		String chk = str.substring(0, 2);
		int myresult = 0;
		if (chk.equals("hi")) {
			String chk1 = str.substring(2, 3);
			if (chk1.equals("t")) {
				String ros = str.substring(3);
				int recresult = countshi(ros);
				myresult = recresult;
			} else {
				String ros = str.substring(2);
				int recresult = countshi(ros);
				myresult = 1 + recresult;
			}
		} else {
			String ros = str.substring(1);
			int recresult = countshi(ros);
			myresult = recresult;

		}
		return myresult;
	}

	public static void removeshi(String str, String ob) {
		if (str.length() < 2) {
			ob = ob + str;
			System.out.println(ob);
			return;
		}
		char cc = str.charAt(0);
		String chk = str.substring(0, 2);
		if (chk.equals("hi")) {
			String chk1 = str.substring(2, 3);
			if (chk1.equals("t")) {
				String ros = str.substring(3);
				removeshi(ros, ob + "hit");
			} else {
				String ros = str.substring(2);
				removeshi(ros, ob);
			}

		} else {
			String ros = str.substring(1);
			removeshi(ros, ob + cc);

		}

	}

	public static void hitobye(String str, String ob) {
		if (str.length() < 2) {
			ob = ob + str;
			System.out.println(ob);
			return;
		}
		char cc = str.charAt(0);
		String chk = str.substring(0, 2);
		if (chk.equals("hi")) {
			String chk1 = str.substring(2, 3);
			if (chk1.equals("t")) {
				String ros = str.substring(3);
				hitobye(ros, ob + "hit");
			} else {
				String ros = str.substring(2);
				hitobye(ros, ob + "bye");
			}

		} else {
			String ros = str.substring(1);
			hitobye(ros, ob + cc);

		}

	}

}
