package Lecture3;

public class FunWithFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("****************************");
		// Part 1 Calling Function
		HelloFun();
		System.out.println("Hello World");

		// Part2 Calling function multiple times
		HelloFun();
		HelloFun();

		// Part 3 Calling multiple functions
		HelloGun();
		HelloFun();

		// Part 4 Calling Nested Functions
		HelloNestedFun();

		// Part 5
		String val = "abcd";
		FunWithStrings(val);

		// Part 6
		String retVal = FunWithReturnStatements();
		System.out.println(retVal);

		// Part 8
		int a = 10, b = 20;
		System.out.println("a= " + a + "b= " + b);
		swap(a, b);
		System.out.println("a= " + a + "b= " + b);

	}

	public static void HelloFun() {
		System.out.println("HelloFun");
	}

	public static void HelloGun() {
		System.out.println("HelloGun");
	}

	public static void HelloNestedFun() {
		System.out.println("Hello Nested Fun");
		HelloFun();
	}

	public static void FunWithStrings(String name) {
		System.out.println(name);

	}

	public static String FunWithReturnStatements() {
		return "Hello";
	}

	public static void swap(int a, int b) {
		System.out.println("a= " + a + "b= " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a= " + a + "b= " + b);
	}

}
