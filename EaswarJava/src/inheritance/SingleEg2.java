package inheritance;

public class SingleEg2 extends SingleEg1 {

	public void display2() {
		System.out.println("This is a Child class Method.");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleEg2 sc1 = new SingleEg2();
		sc1.display();
		sc1.display2();
	}


}
