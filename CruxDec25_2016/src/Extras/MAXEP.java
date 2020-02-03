package Extras;

public class MAXEP {

	public static void main(String[] args) {

		for (int N = 1; N <= 1000; N++) {
			for (int y = 1; y <= N; y++) {
				for (int c = 1; c <= 150; c++) {
					int start = 0, end = N;
					int money = 1000;
					int yon;

					while (true) {
						int mid = (start + end) / 2;
						if (start + 1 == end) {
							if ((mid + 1) == y) {
							} else {
								System.out.println("N= " + N + " y= " + y);
								System.out.println("false");
								System.out.println("********************************");
							}
							// System.out.println("3 " + (mid + 1));
							break;
						}
						// System.out.println("1 " + mid);
						money -= 1;
						if (mid < y) {
							yon = 0;
						} else {
							yon = 1;
						}
						if (yon == 0) {
							start = mid;
						} else if (yon == 1) {
							// System.out.println("2");
							money -= c;
							end = mid;
						} else if (yon == -1) {
							break;
						}
						if (money <= 0) {
							System.out.println("N= " + N + " y= " + y + " c= " + c);
							System.out.println("false");
							System.out.println("********************************");
							break;
						}
					}
				}
			}
		}
	}
}
