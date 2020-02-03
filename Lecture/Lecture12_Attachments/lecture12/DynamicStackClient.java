package lecture12;

import Lecture11.StackUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack = new DynamicStack();

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			displayStackInfo(stack);
		}
		for (int i = 1; i <= 5; i++) {
			stack.push(i*10);
			displayStackInfo(stack);
		}

		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}

		// Part - Show Exception
		// stack.pop();

	}

	public static void displayStackInfo(StackUsingArrays stack) throws Exception {
		System.out.println("*******************************");
		stack.display();
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println("*******************************");

	}

}
