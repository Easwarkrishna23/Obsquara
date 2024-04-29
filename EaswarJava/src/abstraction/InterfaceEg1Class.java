package abstraction;

public class InterfaceEg1Class implements InterfaceEg1 {

	@Override
	public void display(){
		// TODO Auto-generated method stub
		System.out.println("Instance Example");

	}
	public static void main(String args[]) {
		InterfaceEg1Class sc = new InterfaceEg1Class();
		sc.display();
	}
	
}
