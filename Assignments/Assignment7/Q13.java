package Assignment7;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabba ";
		System.out.println(chkstring(str, str.charAt(0)));
	}

	public static boolean chkstring(String str, char fc) {
		if (str.length() == 0) {
			return true;
		}
		if (str.length() == 2 && str.equals("bb")) {
			return true;
		}
		if (str.length() == 1 && str.charAt(0) == 'a') {
			return true;
		}
		if (str.length() == 1 && str.charAt(0) == ' ') {
			return true;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (fc != 'a') {
			return false;
		}
		if (cc == 'a') {
			char nc = str.charAt(1);
			if (nc == 'a' || nc == ' ') {
				return chkstring(ros, fc);
			} else if (str.substring(1, 3).equals("bb")) {
				return chkstring(ros, fc);
			} else {
				return false;
			}
		} else if (cc == 'b') {
			if (str.charAt(1) != 'b') {
				return false;
			} else {
				char nc = str.charAt(2);
				String ros1 = str.substring(2);
				if (nc == 'a' || nc == ' ') {
					return chkstring(ros1, fc);
				} else {
					return false;
				}
			}

		} else {
			return false;
		}

	}

}
