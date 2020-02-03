package Lecture3;

public class FTOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fMin = 0, fStep = 20, fMax = 300;

		int fCurrent = fMin;
		while (fCurrent <= fMax) {
			//int celsius = (5 / 9) * (fCurrent - 32);
			double celsius = ((5.0 / 9) * (fCurrent - 32));
			System.out.println(fCurrent + "\t" + celsius);

			fCurrent = fCurrent + fStep;
		}

	}

}
