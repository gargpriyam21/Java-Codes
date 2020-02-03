package Extras;

public class Extp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if(i<j){
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
