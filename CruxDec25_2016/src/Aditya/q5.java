package Aditya;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < k; i++) {
			int min = 51;
			int index = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			arr[index]++;
		}
		
		
		System.out.println(Arrays.toString(arr).replace("[", "").replace(",", "").replace("]", ""));
	}
}
