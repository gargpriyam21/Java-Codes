package Lecture20;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap<Student> rankList=new Heap<>();
		rankList.add(new Student(700, 30, "C"));
		rankList.add(new Student(500, 50, "A"));
        rankList.add(new Student(900,10,"E"));
        rankList.add(new Student(100, 90, "AK"));
        rankList.add(new Student(400, 60, "NM"));
        rankList.add(new Student(600, 40, "B"));
        rankList.add(new Student(800, 20, "D"));
        rankList.add(new Student(200, 80, "LY"));
        rankList.add(new Student(300, 70, "MY"));
        
        rankList.display();
        rankList.remove();
        System.out.println("*****************************************");
        rankList.display();
	}

	public static class Student implements Comparable<Student> {
		int marks;
		int rank;
		String name;

		public Student(int marks, int rank,String name) {
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
	
	public static void inHeapSort(int[] arr){
		// make a heap
		
		for(int i = (arr.length/2) -1 ; i>=0; i--){
			downheapify(i, arr.length, arr);
		}
		
		
		for(int i =0 ;i <arr.length; i++){
			swap(arr, 0, arr.length-i-1);
			downheapify(0, arr.length-i-1, arr);
		}
	}
	
	public static void downheapify(int pi, int lp, int[] arr){
		int lci=2*pi+1;
		int rci=2*pi+2;
		 int mi=pi;
		if(lci<lp&&arr[lci]>arr[mi]){ // arr[lci]>arr[mi]
			mi=lci;
			
		}
		if(rci<lp&&arr[rci]>arr[mi]){
			mi=rci;
		}
		if(mi!=pi){
			swap(arr,mi, pi);
			downheapify(mi,lp,arr);
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
