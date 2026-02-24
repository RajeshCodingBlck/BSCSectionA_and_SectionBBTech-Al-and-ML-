package TreePackage;

public class Demo {

	public static void fun(int a) {
		
		
		if(a==3) {
			System.out.println(a);
			return ;
		}
		System.out.println(a);
		fun(a++);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		int a=12;
//		int b= a++ - a++;
//		System.out.println(b);
//		System.out.println(a);
		int a=1;
		fun(a);	
		
	}

}
