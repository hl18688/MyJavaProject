package seleniumProg;

public class MethodOverloading {

	

	public void add() {
		
		int a = 2;
		int b = 3;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void add(int a) {
		
		
		System.out.println(a);
		
	}
	
	public void add(int a, float b, int c) {
		

		
		
		System.out.println(a+b-c);
	}
	
	public static void main(String[] args) {
	      
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(2, 3.2f, 6);
		
	
		
		}
		
}
