package polymorphism;

public class ClassB {
	
	static String a = "Hello";
	int b = 10;
	
	public static void main(String[] args) {
		ClassB cB = new ClassB();
		cB.b = 20;
		System.out.println(cB.b);
		a = "Hello Method";
		ClassB cB1 = new ClassB();
		System.out.println(cB1.b);
		System.out.println(cB.b);
		System.out.println(cB.a);
		System.out.println(a);

	}
	
}
