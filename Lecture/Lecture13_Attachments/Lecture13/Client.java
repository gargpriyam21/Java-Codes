package Lecture13;

import Lecture11.QueueUsingArrays;
import lecture12.DynamicQueue;
import lecture12.DynamicStack;
import lecture12.DynamicStackClient;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue q = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			q.enqueue(i);
		}
		q.display();
		reverseQueue(q);
		q.display();
		DynamicStack stack = new DynamicStack();
		DynamicStack helper = new DynamicStack();

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		stack.display();
		reverseStack(stack, helper, 0);
		stack.display();

		System.out.println(isBalanced("{(([{a+b+(c+d)+e}]))"));

	}

	public static void reverseQueue(DynamicQueue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int item = q.dequeue();
		reverseQueue(q);
		q.enqueue(item);
	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if (stack.isEmpty()) {
			return;
		}

		int item = stack.pop();
		reverseStack(stack, helper, idx + 1);
		helper.push(item);
		if (idx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}

	}

	public static boolean isBalanced(String str) throws Exception {
		DynamicStack stack = new DynamicStack();

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc == '{' || cc == '[' || cc == '(') {
				stack.push(cc);
			} else if (cc == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char tc = (char) stack.top();
				if (tc == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (cc == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char tc = (char) stack.top();
				if (tc == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else if (cc == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char tc = (char) stack.top();
				if (tc == '(') {
					stack.pop();
				} else {
					return false;
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
