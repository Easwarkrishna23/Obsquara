package aggregation;

import java.util.*;

public class Student extends Address {

	String name;
	int roll ;
	
	//Address_class Address_method() ---Aggregation
	
	Address address;
	String add;
	
	public void details() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Student: ");
		String name = sc.next();
		this.name = name;
		System.out.println("Enter the roll number : ");
		int roll = sc.nextInt();
		this.roll = roll;
		
		//CREATING AN OBJET IN STUDENT CLASS WITH METHOD ADDRESS FROM ADDRESS CLASS
		
		Student student = new Student();
		String add = student.address();
		this.add = add;
	}
	public void idcard() {
		System.out.println();
		System.out.println("ID CARD 2024");
		System.out.println("Name : " +name);
		System.out.println("Roll NO. : " +roll);
		System.out.println("Address : " +add);
	}
	
	public static void main(String args[]) {
		
		Student s = new Student();
		s.details();
		s.idcard();
	}
}
