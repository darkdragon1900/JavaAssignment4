package javaassignment4;

public class WrapperComparison {

	public static void main(String[] args) {
		
		Integer int1 = new Integer(5);
		Integer int2 = new Integer(5);

		System.out.println("Integer Comparison");
		System.out.println("using equals method");
		System.out.println(int1.equals(int2));
		System.out.println("Using == method");
		System.out.println(int1==int2);
		
		Float f1 = new Float(10.5);
		Float f2 = new Float(10.5);
		
		System.out.println("\nFloat Comparison");
		System.out.println("using equals method");
		System.out.println(f1.equals(f2));
		System.out.println("Using == method");
		System.out.println(f1==f2);
		
		

	}

}
