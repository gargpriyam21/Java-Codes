package Aditya;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class q6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		HashMap<Integer, int[]> map = new HashMap<>();

		int[] arri = new int[2];
		arri[0] = 0;
		arri[1] = 0;
		map.put(1, arri);

		Set<Integer> myset = new HashSet<Integer>();

		for (int m = 0; m < M; m++) {
			int team = s.nextInt();
			int penalty = s.nextInt();

			if (!map.containsKey(team)) {
				int[] arr = new int[2];
				arr[0] = 1;
				arr[1] = penalty;
				map.put(team, arr);
			} else {
				map.get(team)[0]++;
				map.get(team)[1] += penalty;
			}

			int BMT = map.get(1)[0];
			int BMP = map.get(1)[1];

			if (team == 1) {
				Iterator value = myset.iterator();

				while (value.hasNext()) {

					int val = (int) value.next();

					if (map.get(val)[0] > BMT) {
						// myset.add(team);
					} else if (map.get(val)[0] == BMT && map.get(val)[1] < BMP) {
						// myset.add(team);
					} else {
						value.remove();
					}
				}

			} else {
				if (map.get(team)[0] > BMT) {
					myset.add(team);
				} else if (map.get(team)[0] == BMT && map.get(team)[1] < BMP) {
					myset.add(team);
				}
			}

			System.out.println(myset.size() + 1);

		}

	}

}
