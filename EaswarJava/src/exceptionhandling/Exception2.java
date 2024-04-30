package exceptionhandling;

public class Exception2 {
	public static void main(String[] args) {
		// try block
		try {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
		}
		catch(ArithmeticException d){
			System.out.println("Exception Occurred");
		}
		finally {
			System.out.println("Execution Completed");
		}
	}
}
