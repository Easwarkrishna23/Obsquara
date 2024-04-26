package assignments;

public class ThisEg2 {
	int num;
	int fact;
	public void calc(int num)
	{
		this.num = num;
		int fact = 1;
		while(num != 0)
		{
			fact = fact*num;
			num = num-1;
		}
		this.fact = fact;
		this.display();
	}
	public void display()
	{
		System.out.println("Factorial of " +num +" is " +fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEg2 sc = new ThisEg2();
		sc.calc(3);
	}

}
