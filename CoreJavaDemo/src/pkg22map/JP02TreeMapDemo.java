package pkg22map;

import java.util.TreeMap;

public class JP02TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tmPrices = new TreeMap<>();
		
//		System.out.println(hmPrices);
		
		// Add elements
		tmPrices.put("SamsumgTV", 20000);
		tmPrices.put("SonyTV", 30000);
		tmPrices.put("LGTV", 25000);
		tmPrices.put("LGTV", 55000);
		tmPrices.putIfAbsent("LGTV", 1005000);
		tmPrices.putIfAbsent("AppleTV", 2005000);

		System.out.println(tmPrices);
		
//		 Access elements - get() method
//		System.out.println(tmPrices.get("LGTV"));
		
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
//		for(String kStr : tmPrices.keySet()) {
//			
//			System.out.print(kStr);
//			System.out.println(" --> " + tmPrices.get(kStr));
//		}
	}
}
