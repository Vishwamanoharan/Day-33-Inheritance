package inheritance1;

public class A {
	
	static int a=10;
	static {
		System.out.println("Haii I am parent class I will excuate first");
	}
	
	public static void m1() {
		System.out.println("Haii I am M1");
	}
	

}

class B extends A{
	static int b=20;
	
	static {
		System.out.println("Haii Im child I execuate after Parent");
	}
	public static void m2(){
		
		System.out.println("Haii I AM M2");
		
	}
	
	public static void main(String[]args) {
		A.m1();
		B.m2();
		B.m1();
	}
}
