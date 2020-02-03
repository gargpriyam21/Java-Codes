package Assignment7;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q11A*******************");
		System.out.println(appearsoverlap("aaaaaaaaaaaaabbbbaaaa"));
		System.out.println("*******************Q11B*******************");
		System.out.println(appearsoverlap("bdgaaarjdhbaaahf"));
	}

	public static int appearsnotoverlap(String str) {
		if (str.length() < 3) {
			return 0;
		}

		String chk = str.substring(0, 3);
		int myresult = 0;
		if (chk.equals("aaa")) {
			String ros = str.substring(3);
			int recresult = appearsnotoverlap(ros);
			myresult = 1 + recresult;
		} else {
			String ros = str.substring(1);
			int recresult = appearsnotoverlap(ros);
			myresult = recresult;

		}
		return myresult;
	}

	public static int appearsoverlap(String str) {
		if (str.length() < 3) {
			return 0;
		}

		String chk = str.substring(0, 3);
		int myresult = 0;
		if (chk.equals("aaa")) {
			String ros = str.substring(1);
			int recresult = appearsoverlap(ros);
			myresult = 1 + recresult;
		} else {
			String ros = str.substring(1);
			int recresult = appearsoverlap(ros);
			myresult = recresult;

		}
		return myresult;
	}

}
