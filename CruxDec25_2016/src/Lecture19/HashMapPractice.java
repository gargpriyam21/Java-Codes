package Lecture19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbccdef";
		getMaxFreq(str);

		System.out.println("**********************");
		int[] arr1 = { 1, 2, 2, 3, 5, 7, 8 };
		int[] arr2 = { 2, 3, 5, 8, 9 };
		System.out.println(intersection(arr1, arr2));

		System.out.println("**********************");
		System.out.println(chkduplicates(arr1));
	}

	public static void getMaxFreq(String str) {
		HashMap<Character, Integer> freqMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (freqMap.containsKey(a)) {
				freqMap.put(a, freqMap.get(a) + 1);
			} else {
				freqMap.put(a, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entries = freqMap.entrySet();
		char ch = ' ';
		int maxelement = Integer.MIN_VALUE;
		for (Map.Entry<Character, Integer> entry : entries) {
			int element = entry.getValue();
			if (element > maxelement) {
				maxelement = element;
				ch = entry.getKey();
			}
		}
		System.out.println(ch + " = " + maxelement);
	}

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Boolean> Map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			Map.put(arr1[i], false);
		}
		for (int j = 0; j < arr2.length; j++) {
			if (Map.containsKey(arr2[j])) {
				Map.put(arr2[j], true);
			}
		}
		Set<Map.Entry<Integer, Boolean>> entries = Map.entrySet();
		ArrayList<Integer> arr = new ArrayList<>();
		for (Map.Entry<Integer, Boolean> entry : entries) {
			if (entry.getValue()) {
				arr.add(entry.getKey());
			}
		}
		return arr;
	}

	public static boolean chkduplicates(int[] arr) {
		HashMap<Integer, Boolean> Map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int e = arr[i];
			if (Map.containsKey(e)) {
				return true;
			} else {
				Map.put(e, false);
			}
		}
		return false;
	}

	// public static boolean sum0(int[] arr) {
	// HashMap<Integer, Integer> freqMap = new HashMap<>();
	// for (int i = 0; i < arr.length(); i++) {
	// char a = str.charAt(i);
	// if (freqMap.containsKey(a)) {
	// freqMap.put(a, freqMap.get(a) + 1);
	// } else {
	// freqMap.put(a, 1);
	// }
	// }
	// }
}
