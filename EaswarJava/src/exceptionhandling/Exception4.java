package exceptionhandling;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		if(age >18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("Not Eligible");
		}
		
	}

}
