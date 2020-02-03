package lecture12;

public class InPolyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reference - Parent, Object - Parent
		System.out.println("*********************************************");
		P obj1 = new P();

		System.out.println(obj1.d1);
		System.out.println(obj1.d);
		// System.out.println(obj1.d2); //no sense

		obj1.Fun1();
		obj1.Fun();
		// obj1.Fun2(); no sense in this either

		// Parent Reference Child Object

		System.out.println("*********************************************");
		P obj2 = new C();

		System.out.println(obj2.d1);
		System.out.println(obj2.d);
		// System.out.println(obj2.d2);// has sense but compiler doesn't allow
		// this
		System.out.println(((C) obj2).d2);

		obj2.Fun1();
		obj2.Fun();
		// obj2.Fun2(); has sense but compiler doesn't allow this
		((C) obj2).Fun2();

		// Reference - Child, Object - Parent
		// C obj3 = new P(); not allowed by compiler to avoid run-time errors

		// Reference - Child, Object - child
		System.out.println("*********************************************");
		C obj4 = new C();

		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		System.out.println(obj4.d);

		obj4.Fun1();
		obj4.Fun2();
		obj4.Fun();

		// Static check
		System.out.println("*********************************************");
		P obj5 = new C();
		obj5.staticFun();

		P.staticFun();
		C.staticFun();

		// Overload
		Add();
		Add(1);
		Add(1, 2);
		Add(1, 2, 3);
		Add("hi", "bye");
		
//		C obj=(C)new P();
//		System.out.println((C)obj.d);
	}

	// varargs
	public static int Add(int... numbers) {
		int retVal = 0;

		for (int i = 0; i < numbers.length; i++) {
			retVal += numbers[i];
		}

		return retVal;
	}

	public static int Add(int one, int two) {
		return one + two;
	}

	public static String Add(String one, String two) {
		return one + two;
	}

	// An overload can't be just different on the return type
//	 public static void Add(int one, int two){
//	
//	 }
	
	
}
