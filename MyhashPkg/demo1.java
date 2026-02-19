package MyhashPkg;

import java.util.HashMap;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		String str="sahil";
//		System.out.println(str.hashCode() %6);
//		
//		Double d= 2.3;
//		System.out.println(d.hashCode());
//		
//		Boolean b=false;
//		System.out.println(b.hashCode());
		
		       // key, value
		HashMap<String, Integer> hm= new HashMap();
		
		hm.put("Aman", 12);
		hm.put("Akash", 20);
		hm.put("Ajit", 30);
		hm.put("Anil", 40);
		hm.put("Akash", 10);
		hm.remove("Akash");
		System.out.println(hm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// add Any (K,V) Entry
		
//		hm.put("Aman", 70);
//		hm.put("Rohan", 65);
//		hm.put("Akash", 50);
//		hm.put("Anil", 45);
//		System.out.println(hm);
//		hm.put("ajit", 78);
//		System.out.println(hm);
//		
//		// Read 
//		System.out.println(hm.get("Anil"));
//		System.out.println(hm.get("Amit"));
//		
//		System.out.println(hm.getOrDefault("Anit", -10));
//		
//		
//		// look -up
//		System.out.println(hm.containsKey("ajit"));
		
		
		
		
		
	}

}
