package Aditya;

import java.util.ArrayList;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int NT = s.nextInt();
		for (int nt = 0; nt < NT; nt++) {
			int N = s.nextInt();

			int[][] arr = new int[N][3];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = s.nextInt();
				}
			}

			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				int dist = (arr[i][1]) + (arr[i][0] * arr[i][2]);
				list.add(dist);
			}

			int max = Integer.MIN_VALUE;
			for (Integer val : list) {
				if(val>max){
					max = val;
				}
			}

			System.out.println(max);
		}

	}

}
