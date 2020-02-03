//package Extras;
//
//import java.util.Scanner;
//
//class Node {
//	int data;
//	Node next;
//
//	public Node(int data) {
//		this.data = data;
//	}
//}
//
//class LinkedForm {
//
//	int size = 0;
//	Node tail;
//	Node head;
//
//	public LinkedForm() {
//		this.size = 0;
//		this.tail = null;
//		this.head = null;
//	}
//
//	public int size() {
//		return this.size;
//	}
//
//	public boolean isEmpty() {
//		return this.size == 0;
//	}
//
//	public void add(int data) {
//		Node node = new Node(data);
//		node.next = null;
//		if (this.isEmpty()) {
//			this.tail = node;
//			this.head = node;
//
//		} else {
//			tail.next = node;
//			this.tail = node;
//		}
//		this.size++;
//	}
//
//	public int getNode(int index) {
//		if (index < size) {
//			Node temp1 = this.head;
//			int counter = 0;
//			while (counter < index) {
//				temp1 = temp1.next;
//				counter++;
//			}
//			return temp1.data;
//		}
//		return 0;
//
//	}
//
//	public void show() {
//		// System.out.println(getNode(3));
//		// System.out.println("=====");
//		Node temp = this.head;
//		for (int i = 0; i < this.size(); i++) {
//			System.out.println(temp.data);
//			temp = temp.next;
//		}
//	}
//
//	// public void del1(int k) {
//	// if (size == 1 && head.data == k) {
//	// this.head = null;
//	// size--;
//	// }
//	//
//	// else if (size == 0 || size == 1) {
//	// return;
//	// }
//	// Node tempb = null;
//	// Node tempf = head;
//	//
//	// if (size > 1) {
//	// if (k == tempf.data) {
//	// this.head = tempf.next;
//	// size--;
//	// }
//	//
//	// else if (k == tail.data) {
//	// while (tempf.next != null) {
//	// tempb = tempf;
//	// tempf = tempf.next;
//	// }
//	// tempb.next = null;
//	// }
//	//
//	// else {
//	// while (tempf != null && tempf.data != k) {
//	// tempb = tempf;
//	// tempf = tempf.next;
//	// }
//	// if (tempf == null) {
//	// return;
//	// } else {
//	// tempb.next = tempf.next;
//	// size--;
//	// }
//	// }
//	//
//	// }
//	// }
//
//}
//
//class Queue {
//	int[] que = new int[10000];
//	int first = 0;
//	int last = 0;
//
//	public boolean notisEmpty() {
//		return first != last;
//	}
//
//	public void add(int val) {
//		que[last] = val;
//		last++;
//	}
//
//	public int del() {
//		if (last == first) {
//			return que[first];
//		}
//		return que[first++];
//	}
//}
//
//public class graph {
//
//	public static void bfs(LinkedForm arr[], int m, boolean[] visited, int arr3[], int[] arrpeople) {
//		Queue que = new Queue();
//		int z = 0;
//		for (int i = 0; i < m; i++) {
//			if (arr[i].size() != 0) {
//				z = i;
//				break;
//			}
//		}
//		que.add(z);
//		visited[z] = true;
//		while (que.notisEmpty()) {
//			int v = que.del();
//			if (arr[v].size() > 0) {
//				for (int i = 0; i < arr[v].size(); i++) {
//					int temp = arr[v].getNode(i);
//					if (visited[temp] == false) {
//						visited[temp] = true;
//						que.add(temp);
//						if (arrpeople[temp] < arr3[v]) {
//							arr3[v] = arrpeople[temp];
//						}
//
//					}
//				}
//			} else {
//				arr3[v] = -1;
//			}
//		}
//
//		// for(int a = 0;a<m;a++) {
//		// if(visited[a]==false) {
//		// bfs()
//		// }
//		// }
//
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//
//		int n = s.nextInt();
//		int[] arrpeople = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			int a = s.nextInt();
//			arrpeople[i] = a;
//
//		}
//
//		int m = s.nextInt();
//
//		LinkedForm[] arr = new LinkedForm[n];
//		boolean[] visited = new boolean[n];
//
//		for (int p = 0; p < n; p++) {
//			arr[p] = new LinkedForm();
//		}
//
//		for (int k = 0; k < m; k++) {
//			int big = s.nextInt();
//			int small = s.nextInt();
//			arr[small - 1].add(big - 1);
//		}
//
//		int[] arr3 = new int[m];
//		for (int h = 0; h < m; h++) {
//			arr3[h] = 100000000;
//		}
//
//		bfs(arr, m, visited, arr3, arrpeople);
//
//		int j = s.nextInt();
//		//
//		for (int sx = 0; sx < j; sx++) {
//			int y = s.nextInt();
//			System.out.println(arr3[y - 1]);
//		}
//
//	}
//
//}