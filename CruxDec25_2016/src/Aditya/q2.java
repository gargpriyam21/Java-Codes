package Aditya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ip = br.readLine();
		String[] sarr = ip.trim().split("\\s+");
		int N = Integer.parseInt(sarr[0]);
		int M = Integer.parseInt(sarr[1]);
		HashMap<String, int[]> map = new HashMap<>();

		for (int m = 0; m < M; m++) {

			String inp = br.readLine();
			String[] sinp = inp.trim().split("\\s+");
			String name = sinp[0];
			int p = Integer.parseInt(sinp[1]);

			if (!map.containsKey(name)) {
				int[] arr = new int[2];
				arr[0] = 1;
				arr[1] = p;
				map.put(name, arr);
			} else {
				map.get(name)[0]++;
				map.get(name)[1] += p;
			}

		}

		int BMT = map.get("BhayanakMaut")[0];
		int BMP = map.get("BhayanakMaut")[1];

		int count = 0;
		for (Map.Entry<String, int[]> entry : map.entrySet()) {
			if(entry.getValue()[0]<BMT){
				count++;
			}else if(entry.getValue()[0]==BMT && entry.getValue()[1]>BMP){
				count++;
			}
			
			System.out.println(entry.getKey() + " " + entry.getValue()[0] + " " + entry.getValue()[1]);
		}
		System.out.println(N-count);


	}

}
