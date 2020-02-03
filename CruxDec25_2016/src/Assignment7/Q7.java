package Assignment7;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movextoend("abexexdexed", "", "");
	}

	public static void movextoend(String str, String ob, String op) {
		if (str.length() == 1) {
			ob = ob + str.charAt(0);
			System.out.println(ob + op);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		if (cc == 'x') {
			movextoend(ros, ob, op + cc);
		} else {
			movextoend(ros, ob + cc, op);
		}

	}

}
