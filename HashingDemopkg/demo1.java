package HashingDemopkg;

public class demo1 {

	
	public static int hashFunction(String str) {
		
		int sum=0;
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			sum+= i*ch;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		String str="abcd";
		System.out.println(str.hashCode());
//		
//		Double d= 3.4;
//		System.out.println(d.hashCode());
//		
//		Boolean b= true;
//		System.out.println(b.hashCode());
//		Character c='c';
//		System.out.println(c.hashCode());
//		
		
		System.out.println(hashFunction("abcd"));
		System.out.println(hashFunction("bcda"));
		System.out.println(hashFunction("bcad"));
		System.out.println(hashFunction("badc"));
	}
}
