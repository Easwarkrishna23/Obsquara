package inheritance;

public class HierarchyClass3 extends HierarchyClass2{

	public static void display3() {
		System.out.println("Class-C");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchyClass3 sc = new HierarchyClass3();
		sc.display1();
		sc.display2();
		sc.display3();
		
		
	}

}
