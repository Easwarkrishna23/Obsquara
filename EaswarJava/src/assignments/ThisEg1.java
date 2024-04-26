package assignments;

public class ThisEg1 {
	
	int num;
	int rev;
	//Constructor to calculate Reverse
	public ThisEg1(int num)
	{
		this.num = num;
		int rev = 0;
		while (num != 0)
		{
			int digit =  num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		this.rev = rev;
		
		
	}
	public ThisEg1() {
		this(1234);
		System.out.println("Reverse of the string is : " +rev);
	}
	


	public static void main(String[] args) {	
		
		ThisEg1 sc = new ThisEg1();
		// TODO Auto-generated method stub

	}

}
