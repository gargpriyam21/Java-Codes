package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The size of the array");
		int N = s.nextInt();
		int[] arr1 = new int[N];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please Enter the" + i + "th element");
			arr1[i] = s.nextInt();
		}
		Arrays.sort(arr1);
		int[] arr2 = new int[N];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Please Enter the" + i + "th element");
			arr2[i] = s.nextInt();
		}
		Arrays.sort(arr2);
		System.out.println(printintersection(arr1, arr2));
	}

	public static ArrayList<Integer> printintersection(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		ArrayList<Integer> baseresult = new ArrayList<>();
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr1[i]) {
				j++;
			} else {
				baseresult.add(arr2[j++]);
				i++;
			}
		}
		return baseresult;
	}
}
