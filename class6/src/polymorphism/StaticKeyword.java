package polymorphism;

public class StaticKeyword {
	
	static String a = "Hello";
	int b = 10;
	public static void main(String[] args) {
		StaticKeyword sK = new StaticKeyword();
		sK.test();}
	public void test() {
		StaticKeyword sK = new StaticKeyword();
		StaticKeyword sK1 = new StaticKeyword();
		a = "Hello Method";
		sK.a="Hello4";
		sK.b = 45;
		sK1.b= 65;
		System.out.println(StaticKeyword.a);  //Hello Method
		System.out.println(a); // Hello Method
		System.out.println(sK.a); // Hello Method
		System.out.println(sK.b); 
		System.out.println(b); 
		System.out.println(sK1.b); 
	}
}
