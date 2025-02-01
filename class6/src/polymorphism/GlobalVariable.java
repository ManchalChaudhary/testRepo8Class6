package polymorphism;

public class GlobalVariable {
	
		static String a = "Hi";
		int b = 10;
		
	public static void main(String[] args) {
		
	   String a = "Hello"; //Local variable
		System.out.println(a);
		
		test();
		GlobalVariable gV = new GlobalVariable();
		gV.test2();

	}
	
	public static void test() {
		GlobalVariable gV = new GlobalVariable();
		System.out.println(gV.b);}
	
	public void test2() {System.out.println(a);}

}
