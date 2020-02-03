package Lecture11;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays(6);

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			displayStackInfo(stack);
		}
		// while (!stack.isEmpty()) {
		// displayStackInfo(stack);
		// stack.pop();
		// }
		
		stack.pop();
		displayStackInfo(stack);

	}

	public static void displayStackInfo(StackUsingArrays stack) throws Exception {
		System.out.println("************************");
		stack.display();
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println("************************");
	}

}
