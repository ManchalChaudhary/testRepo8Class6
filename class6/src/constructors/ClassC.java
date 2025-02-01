package constructors;

public class ClassC {
	
	//Scanner ui = new Scanner();
	public static void main(String[] args) {
		ClassC cC = new ClassC();
	}
	public static void C1() {System.out.println("C1");}
	public  void C2(int a) {System.out.println("C2");}
	// constructor overloading
	 ClassC() {
		 
		 System.out.println("I am main constructor");}
	 ClassC(int a) {
		 
		 System.out.println(10);}
	 ClassC(String a, int b) {
		 this (20);
		 System.out.println("Hello");
		 System.out.println(20);
		 }
	 
	
	
	//  ClassC() {}
}
