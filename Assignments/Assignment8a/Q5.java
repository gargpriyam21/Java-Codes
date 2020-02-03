package Assignment8a;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************Q5A*******************");
		System.out.println(countTOH("src", "dest", "helper", 3) - 1);
		System.out.println("*******************Q5B*******************");
		printTOH("src", "dest", "helper", 3);
	}

	public static void printTOH(String src, String dest, String helper, int discs) {
		if (discs == 0) {
			return;
		}
		printTOH(src, helper, dest, discs - 1);
		System.out.println("Move " + discs + " from " + src + " to " + dest);
		printTOH(helper, dest, src, discs - 1);
	}

	public static int countTOH(String src, String dest, String helper, int discs) {
		if (discs == 0) {
			return 1;
		}
		int counter = 0;
		counter = counter + countTOH(src, helper, dest, discs - 1);
		counter = counter + countTOH(helper, dest, src, discs - 1);
		return counter;
	}

}
