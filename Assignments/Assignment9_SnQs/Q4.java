package Assignment9_SnQs;

import Lecture12.DynamicStack;

public class Q4 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str = "[a+{b+(c+d)+e}+f]";
		System.out.println(isitbalanced(str));
	}

	public static boolean isitbalanced(String str) throws Exception {
		DynamicStack stack = new DynamicStack();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc == '{' || cc == '(' || cc == '[') {
				stack.push(cc);
			} else if (cc == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char tc = (char) stack.top();
				if (tc == '{') {
					stack.pop();
				}
			} else if (cc == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char tc = (char) stack.top();
				if (tc == '(') {
					stack.pop();
				}
			} else if (cc == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char tc = (char) stack.top();
				if (tc == '[') {
					stack.pop();
				}
			} else {

			}
		}
		if (!stack.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

}
