package polymorphism;

public class StaticVariable {
	
	static String a = "Hello";
	int b = 10;
	public static void main(String[] args) {
		
		String a = "Hi";
		int b = 45;
		StaticVariable sV = new StaticVariable();
		System.out.println(a);
		System.out.println(StaticVariable.a);
		System.out.println(b);
		System.out.println(sV.b);
		
		
		
		

	}

}
