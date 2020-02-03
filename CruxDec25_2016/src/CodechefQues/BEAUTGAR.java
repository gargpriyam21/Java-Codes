package CodechefQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BEAUTGAR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int NOTC = Integer.parseInt(br.readLine());

		for (int i = 0; i < NOTC; i++) {
			int RC = 0, GC = 0;
			String str = br.readLine();
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				if (str.charAt(0) == 'R') {
					RC++;
				} else {
					GC++;
				}
			}
			for (int j = 0; j < str.length() - 1; j++) {
				if (str.charAt(j) == str.charAt(j + 1)) {
					if (str.charAt(j) == 'R') {
						RC++;
					} else {
						GC++;
					}
				}
			}
			if (RC == GC) {
				if (RC < 2) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else {
				System.out.println("no");
			}
		}
	}
}
