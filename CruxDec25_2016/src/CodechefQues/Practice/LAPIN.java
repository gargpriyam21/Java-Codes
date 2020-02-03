package CodechefQues.Practice;

import java.util.Scanner;

public class LAPIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int NOTC = s.nextInt();

		for (int n = 0; n < NOTC; n++) {
			String str = s.next();
			int l = str.length();
			if (l % 2 == 0) {
				int mid = l / 2;
				String s1 = str.substring(0, mid);
				String s2 = str.substring(mid, l);
				System.out.println(s1 + " " + s2);
			} else {
				int mid = l / 2;
				String s1 = str.substring(0, mid);
				String s2 = str.substring(mid + 1, l);
				System.out.println(s1 + " " + s2);
			}

		}

	}

}
