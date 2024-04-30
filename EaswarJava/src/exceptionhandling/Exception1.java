package exceptionhandling;

public class Exception1 {

	public static void main(String[] args) {
		// 
		try {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
		}
		catch(ArithmeticException d){
			System.out.println("Exception Occurred");
		}

	}

}