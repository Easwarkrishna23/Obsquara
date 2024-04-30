package exceptionhandling;

public class Exception5 {

	public static void main(String[] args) throws AgeException {
		// Custom Exception
		int age = 10;
		if(age > 18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new AgeException("Not Eligible");
		}

	}

}
