package CodechefQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Lecture10.ComplexityDemos;

class MAGICHF2 {

	public static void main(String[] args) throws IOException {
		ComplexityDemos.startAlgo();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] val = new double[10000000];
		int NOTC = Integer.parseInt(br.readLine());
		int D;
		for (int i = 0; i < NOTC; i++) {
			String ip = br.readLine();
			String[] sarr = ip.trim().split("\\s+");
			long N = Long.parseLong(sarr[0]);
			long K = Long.parseLong(sarr[1]);
			long yo = N - (2 * K);
			if (yo < 0) {
				D = 1;
			} else if (yo > 10000000) {
				D = 0;
				System.out.printf("%1.6f\n", 0.0);
				continue;
			} else {

				if (yo >= 0 && yo <= 1) {
					D = 2;
				} else {
					D = (int) yo;
				}
			}
			if (val[D] == 0) {
				val[D] = 1 / (double) D;
			}
			double result = val[D];
			System.out.printf("%1.6f\n", result);
		}
		System.out.println(ComplexityDemos.endAlgo());
	}
}