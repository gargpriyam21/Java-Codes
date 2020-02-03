package Lecture19;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String, Integer> map = new HashTable<>(3);

		map.put("US", 200);
		map.put("UK", 250);
		map.put("China", 300);
		map.put("India", 275);
		map.put("Taiwan", 100);
		map.put("Aus", 130);
		map.put("Siberia", 10);
		map.display();

		System.out.println("*********************************************************");
		map.put("US", 400);
		map.display();

		System.out.println("*********************************************************");
		System.out.println(map.get("US"));
		System.out.println(map.get("Pak"));

		System.out.println("*********************************************************");
		System.out.println(map.contains("US"));

		System.out.println("*********************************************************");
		map.remove("US");
		map.display();
		
		

	}

}
