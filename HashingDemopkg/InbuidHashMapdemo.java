package HashingDemopkg;

import java.util.HashMap;

public class InbuidHashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // key value
//		HashMap< String, Integer> hm=new HashMap();
//		
//		// add the Entry (key, value)
//       hm.put("Akash", 70);
//       hm.put("Aman", 50);
//       hm.put("Ankit", 60);
//       System.out.println(hm);
//       
//       // Read the data  from HashMap
//       System.out.println(hm.get("Akash"));
//       System.out.println(hm.get("Aman"));
//       System.out.println(hm.get("Ankita"));
//       
//       System.out.println(hm.getOrDefault("Ankit",-100));
//       
//       
//       // remove
//       hm.remove("Ankit");
//       System.out.println(hm);
         
		
		HashMap<String, Integer> hm= new HashMap();
		hm.put("Aman", 50); // add
		hm.put("Anjali", 60); // add
		hm.put("Ankit", 70); // add
		hm.put("Anjali", 50); // update
		System.out.println(hm);
		
		System.out.println(hm.containsKey("Ankit"));
		
		System.out.println(hm.size());
		
		
       
		
       
       
       
	}

}
