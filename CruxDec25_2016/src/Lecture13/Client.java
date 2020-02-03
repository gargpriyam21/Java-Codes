package Lecture13;

import Lecture12.DynamicQueue;
import Lecture12.DynamicStack;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// REVERSE QUEUE
		DynamicQueue queue = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
		}
		queue.display();
		ReverseQueue(queue);
		queue.display();
		// REVERSE STACK
		DynamicStack stack = new DynamicStack();
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		stack.display();
		Reverse(stack, new DynamicStack(), 0);
		stack.display();
		// BRACKET BALANCED
		String str = "[a+{b+(c+d)+e}+f]";
		System.out.println(isitbalanced(str));
	}

	public static void ReverseQueue(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}
		int item = queue.dequeue();
		ReverseQueue(queue);
		queue.enqueue(item);
	}

	public static void Reverse(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		Reverse(stack, helper, idx + 1);
		helper.push(item);
		if (idx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
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
