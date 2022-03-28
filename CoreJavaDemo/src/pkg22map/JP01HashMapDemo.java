package pkg22map;

import java.util.HashMap;

public class JP01HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmPrices = new HashMap<>();
		
//		System.out.println(hmPrices);
		
		// Add elements
		hmPrices.put("SamsumgTV", 20000);
		hmPrices.put("SonyTV", 30000);
		hmPrices.put("LGTV", 25000);

		System.out.println(hmPrices);
		
		// Access elements - get() method
//		System.out.println(hmPrices.get("LGTV"));
		
//		// Keys
//		System.out.println("Keys: " + hmPrices.keySet());
//		
//		// Values
//		System.out.println("Values: " + hmPrices.values());
//		
//		// Key values
//		System.out.println("Keys/Values: " + hmPrices.entrySet());
//		
//		// Change values
//		hmPrices.replace("LGTV", 15000);
//		System.out.println("Keys/Values: " + hmPrices.entrySet());
		
		// Remove values
//		hmPrices.remove("LGTV");
//		System.out.println("Keys/Values: " + hmPrices.entrySet());
		
		
		// Iterating on Map
		for(String kStr : hmPrices.keySet()) {
			
			System.out.print(kStr);
			System.out.println(" --> " + hmPrices.get(kStr));
		}
	}
}
