package Lecture19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap<String, Integer> popMap=new HashMap<>();
		//
		// popMap.put("US", 200);
		// popMap.put("UK", 250);
		// popMap.put("China", 300);
		// popMap.put("India", 275);
		//
		// System.out.println(popMap);
		//
		// System.out.println(popMap.get("India"));
		// System.out.println(popMap.get("Germany"));
		//
		// System.out.println(popMap.remove("UK"));
		// System.out.println(popMap.remove("Germany"));
		// System.out.println(popMap);
		//
		// System.out.println(popMap.containsKey("India"));
		// System.out.println(popMap.containsKey("Egypt"));
		//
		// Set<String> keys=popMap.keySet();
		// System.out.println(keys);
		//
		// for(String key:keys){
		// System.out.println(key);
		// }
		//
		// Collection<Integer> values=popMap.values();
		// System.out.println(values);
		//
		// Set<Map.Entry<String, Integer>> entries=popMap.entrySet();
		// for(Map.Entry<String, Integer> entry:entries){
		// System.out.println(entry.getKey());
		// System.out.println(entry.getValue());
		// }

		System.out.println(getMaxFreq("aabbbccdef"));
		int[] one = { 2, 4, 4, 5, 7, 9 };
		int[] two = { 2, 4, 5, 9, 10, 51 };
		System.out.println(getCommonElements(one, two));

	}

	public static Character getMaxFreq(String str) {
		HashMap<Character, Integer> freqMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (freqMap.containsKey(cc)) {
				int ov = freqMap.get(cc);
				ov = ov + 1;
				freqMap.put(cc, ov);
			} else {
				freqMap.put(cc, 1);
			}
		}

		int max_freq = Integer.MIN_VALUE;
		char max_char = '\0';

		Set<Map.Entry<Character, Integer>> entries = freqMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > max_freq) {
				max_freq = entry.getValue();
				max_char = entry.getKey();
			}
		}

		return max_char;

	}

	public static ArrayList<Integer> getCommonElements(int[] one, int[] two) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int val : one) {
			map.put(val, false);
		}

		for (int val : two) {
			if (map.containsKey(val)) {
				map.put(val, true);
			}
		}
		ArrayList<Integer> retVal = new ArrayList<>();
		Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
		for (Map.Entry<Integer, Boolean> entry : entries) {
			if (entry.getValue()) {
				retVal.add(entry.getKey());
			}
		}

		return retVal;

	}

}
