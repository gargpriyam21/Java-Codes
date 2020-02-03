package Lecture20;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heap<Student> rankList = new Heap<>();
		rankList.add(new Student(700, 30, "C"));
		rankList.add(new Student(500, 50, "A"));
		rankList.add(new Student(900, 10, "E"));
		rankList.add(new Student(100, 90, "AK"));
		rankList.add(new Student(400, 60, "NM"));
		rankList.add(new Student(600, 40, "B"));
		rankList.add(new Student(800, 20, "D"));
		rankList.add(new Student(200, 80, "LY"));
		rankList.add(new Student(300, 70, "MY"));
		rankList.display();

		int[] arr = { 7, 5, 9, 1, 4, 6, 8, 2, 3 };
		inHeapSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static class Student implements Comparable<Student> {
		int marks;
		int rank;
		String name;

		public Student(int marks, int rank, String name) {
			this.name = name;
			this.marks = marks;
			this.rank = rank;
		}

		public String toString() {
			return "{" + this.name + ", M=" + this.marks + ", R=" + this.rank + "}";
		}

		public int compareTo(Student o) {
			return this.marks - o.marks;
		}
	}

	public static void inHeapSort(int[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			downHeapify(i, arr.length, arr);
		}
		for (int i = 0; i < arr.length; i++) {
			swap(arr, 0, arr.length - i - 1);
			downHeapify(0, arr.length - i - 1, arr);
		}
	}

	public static void downHeapify(int pi, int lp, int[] arr) {
		int lc = (2 * pi) + 1;
		int rc = (2 * pi) + 2;
		int mi = pi;
		if (lc < lp && arr[lc] > arr[mi]) {
			mi = lc;
		}
		if (rc < lp && arr[rc] > arr[mi]) {
			mi = rc;
		}
		if (mi != pi) {
			swap(arr, mi, pi);
			downHeapify(mi, lp, arr);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
