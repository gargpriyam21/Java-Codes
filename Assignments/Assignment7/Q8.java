package Assignment7;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q8A*******************");
		System.out.println(countshi("hisowhyhiwhy"));
		System.out.println("*******************Q8B*******************");
		removeshi("hisowhyhiwhy", "");
		System.out.println("*******************Q8C*******************");
		hitobye("hisowhyhiwhy", "");
	}

	public static int countshi(String str) {
		if (str.length() < 2) {
			return 0;
		}

		String chk = str.substring(0, 2);
		int myresult = 0;
		if (chk.equals("hi")) {
			String ros = str.substring(2);
			int recresult = countshi(ros);
			myresult = 1 + recresult;
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
			String ros = str.substring(2);
			removeshi(ros, ob);

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
			String ros = str.substring(2);
			hitobye(ros, ob + "bye");

		} else {
			String ros = str.substring(1);
			hitobye(ros, ob + cc);

		}

	}

}
