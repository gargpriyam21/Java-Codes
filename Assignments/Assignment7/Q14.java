package Assignment7;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getParentContent("abc(xyz)def", false));
	}

	public static String getParentContent(String str, boolean startFound) {

		char cc = str.charAt(0);
		String ros = str.substring(1);

		if (cc == '(') {
			String recResult = (getParentContent(ros, true));
			String myResult = recResult;
			return myResult;
		} else if (cc == ')') {
			return "";
		} else {
			String recResult = getParentContent(ros, startFound);
			String myResult = "";
			if (startFound) {
				myResult = cc + recResult;
			} else {
				myResult = recResult;
			}
			return myResult;
		}
	}

}
