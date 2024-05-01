package superassignment;

public class Division extends Addition {

	public void div() {
		int add = super.add(a, b);
		System.out.println("Sum is : " +super.add(a, b));
		int div = add / 10;
		System.out.println("Division Result is : " +div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Division sc = new Division();
		sc.add(10,20);
		sc.div();

	}

}
