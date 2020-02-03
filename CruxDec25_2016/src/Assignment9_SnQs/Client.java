package Assignment9_SnQs;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Question No.: ");
		int q = s.nextInt();
		if (q == 1) {
			System.out.print("Enter The Question No. Part a or b: ");
			char c = s.next().charAt(0);
			if (c == 'a') {
				Q1a queue1 = new Q1a();
				for (int i = 1; i <= 5; i++) {
					queue1.enqueue(i);
					displayQueueInfo1(queue1);
				}
				queue1.dequeue();
				displayQueueInfo1(queue1);
				queue1.enqueue(60);
				displayQueueInfo1(queue1);
				for (int i = 1; i <= 5; i++) {
					queue1.enqueue(i * 10);
					displayQueueInfo1(queue1);
				}

				while (!queue1.isEmpty()) {
					System.out.println(queue1.front());
					System.out.println(queue1.size());
					queue1.dequeue();
					displayQueueInfo1(queue1);
				}
			} else if (c == 'b') {

				Q1b queue2 = new Q1b();
				for (int i = 1; i <= 5; i++) {
					queue2.enqueue(i);
					displayQueueInfo2(queue2);
				}
				queue2.dequeue();
				displayQueueInfo2(queue2);
				queue2.enqueue(60);
				displayQueueInfo2(queue2);
				for (int i = 1; i <= 5; i++) {
					queue2.enqueue(i * 10);
					displayQueueInfo2(queue2);
				}

				while (!queue2.isEmpty()) {
					System.out.println(queue2.front());
					System.out.println(queue2.size());
					queue2.dequeue();
					displayQueueInfo2(queue2);
				}
			}
		} else if (q == 2) {
			char c = s.next().charAt(0);
			if (c == 'a') {
				Q2a stack1 = new Q2a();
				for (int i = 1; i <= 5; i++) {
					stack1.push(i);
					displayStackInfo1(stack1);
				}
				for (int i = 1; i <= 5; i++) {
					stack1.push(i * 10);
					displayStackInfo1(stack1);
				}
				while (!stack1.isEmpty()) {
					displayStackInfo1(stack1);
					stack1.pop();
				}
				stack1.pop();

			} else if (c == 'b') {
				Q2b stack2 = new Q2b();
				for (int i = 1; i <= 5; i++) {
					stack2.push(i);
					displayStackInfo2(stack2);
				}
				for (int i = 1; i <= 5; i++) {
					stack2.push(i * 10);
					displayStackInfo2(stack2);
				}
				while (!stack2.isEmpty()) {
					displayStackInfo2(stack2);
					stack2.pop();
				}
				stack2.pop();
			}
		} else if (q == 5) {
			Q5 stack = new Q5();
			for (int i = 1; i <= 5; i++) {
				stack.push(i * 1);
			}
			System.out.println(stack.getMinimum());
		}
	}

	public static void displayStackInfo1(Q2a stack) throws Exception {
		System.out.println("************************");
		stack.display();
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println("************************");
	}

	public static void displayStackInfo2(Q2b stack) throws Exception {
		System.out.println("************************");
		stack.display();
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println("************************");
	}

	public static void displayQueueInfo1(Q1a queue) throws Exception {
		System.out.println("************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("************************");
	}

	public static void displayQueueInfo2(Q1b queue) throws Exception {
		System.out.println("************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("************************");
	}

}
