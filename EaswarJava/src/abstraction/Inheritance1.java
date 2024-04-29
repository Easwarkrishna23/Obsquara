package abstraction;

public class Inheritance1 implements InheritanceEg1,InheritanceEg2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is First Instance - Parent ");
	}
	public void display2() {
		System.out.println("This is Second Instance - Parent ");
	}
	
	public void display3() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance1 sc = new Inheritance1();
		sc.display();
		sc.display2();
		sc.display3();

	}

}
