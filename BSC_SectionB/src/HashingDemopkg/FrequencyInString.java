package HashingDemopkg;

import java.util.*;
public class FrequencyInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str="BalloonBallo";
		
		HashMap<Character, Integer> hm= new HashMap();
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(hm.containsKey(ch)) {
				// code
				int old_fre= hm.get(ch);
				hm.put(ch, old_fre+1);
			}else {
				// code
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		
		int [] arr= {1,4,5,2,4,6};
		
		System.out.println(hm.keySet());
		for( char key : hm.keySet()) {
			 System.out.println(key +" -> "+ hm.get(key));
		}
		
		for( int val: hm.values()) {
			 System.out.println(val);
		}
		
		System.out.println(hm.entrySet());
		
		for( Map.Entry<Character, Integer> e: hm.entrySet()) {
			
		}
		
		
		
	}

}
