package CodechefQues.JanChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FANCY {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int NOTC = Integer.parseInt(br.readLine());

		for (int i = 0; i < NOTC; i++) {
			boolean isfancy = true;
			String str = br.readLine();

			if (str.matches(".*\\bnot\\b.*")) {
				System.out.println("Real Fancy");
			} else {
				System.out.println("regularly fancy");
			}
		}
	}
}
