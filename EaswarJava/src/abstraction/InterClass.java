package abstraction;

public class InterClass implements Inter2 {

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("This is the method of first Interface.");
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("This is the method of second Interface");

	}
	
	public void display3() {
		System.out.println("This is the method of The Child Class.");
	}

	//Main Method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterClass sc = new InterClass();
		sc.display1();
		sc.display2();
		sc.display3();
	}

}
