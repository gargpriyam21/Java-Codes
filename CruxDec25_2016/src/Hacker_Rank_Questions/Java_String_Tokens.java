package Hacker_Rank_Questions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_String_Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
        int x = st.countTokens();
        System.out.println(x);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
		// Write your code here.
		scan.close();
	}

	public static String[] tokens(String s) {

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='['){
				//[A-Za-z !,?._'@]+,
				
			}
		}
		return null;
	}

}
