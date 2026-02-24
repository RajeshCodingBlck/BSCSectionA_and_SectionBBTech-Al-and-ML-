package HashingDemopkg;

import java.util.HashMap;

public class FreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,2,1, 3, 2, 1, 1, 4, 5, 4};
              // key, value
        HashMap<Integer, Integer> hm= new HashMap();  
        for(int i=0;i<arr.length;i++) {
        	
        	if(hm.containsKey(arr[i])==true) {
        		 
        		int oldFre= hm.get(arr[i]);
        		hm.put(arr[i], oldFre+1);
        	}else {
        		hm.put(arr[i], 1);
        	}
        }
        System.out.println(hm);
        
        
        
	}

}
