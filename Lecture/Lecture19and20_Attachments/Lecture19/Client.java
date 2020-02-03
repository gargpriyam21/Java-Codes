package Lecture19;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String, Integer> popMap = new HashTable<>(3);
		popMap.put("US", 200);
		popMap.put("UK", 250);
		popMap.put("China", 300);
		popMap.put("India", 275);

		popMap.display();

		popMap.put("Taiwan", 100);
		popMap.put("Aus", 130);
		popMap.display();
		popMap.put("Siberia", 10);
		popMap.display();
		
		System.out.println(popMap.get("US"));
		System.out.println(popMap.get("Pak"));
		
		popMap.remove("US");
		popMap.display();
	}

}
