package Assignment6;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle(3, 0);
	}

	public static void triangle(int num, int retVal) {
		if (num == 0) {
			System.out.println(retVal);
			return;
		}
		retVal = num + retVal;
		triangle(num - 1, retVal);
	}

}
