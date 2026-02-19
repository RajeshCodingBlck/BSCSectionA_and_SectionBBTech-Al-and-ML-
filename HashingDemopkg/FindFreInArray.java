package HashingDemopkg;

import java.util.HashMap;

public class FindFreInArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {1,2,2,5,1,7,8,2,1};
		HashMap<Integer, Integer> hm= new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			
			if(hm.containsKey(arr[i])) { // true Present 
				int old_fre= hm.get(arr[i]);
				hm.put(arr[i], old_fre+1);
				
			}else { // False Not Present
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		
	}

}
