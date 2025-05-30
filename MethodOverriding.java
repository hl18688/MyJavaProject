package seleniumProg;

public class MethodOverriding extends MethodOverloading{
	
	public void add() {
		
		int a =11;
		int b = 15;
		
		System.out.println(a+b);
	}
	
public void add(int a, float b, int c) {
		

		
		
		System.out.println(a+b-c);
	}
	
	

	public static void main(String[] args) {
		
		MethodOverriding obj1 = new MethodOverriding();
		
		obj1.add(5, 9.2f, 2);
		

	}

}
