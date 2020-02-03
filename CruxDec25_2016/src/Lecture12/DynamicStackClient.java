package Lecture12;

import Lecture11.StackUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack stack = new DynamicStack();

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			displayStackInfo(stack);
		}
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			displayStackInfo(stack);
		}

		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}

		 stack.pop();
//		stack.display();
//		Reverse(stack, new DynamicStack(), 0);
//		stack.display();
	}

	public static void displayStackInfo(StackUsingArrays stack) throws Exception {
		System.out.println("************************");
		stack.display();
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println("************************");
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
}
