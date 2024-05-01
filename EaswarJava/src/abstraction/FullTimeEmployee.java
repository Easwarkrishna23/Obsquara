package abstraction;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{

	int pay = 300;
	public void CalculateSalary() {
		float salary = pay * 8;
		System.out.println("Total salary per day for a Full Time Employee : " +salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee e = new FullTimeEmployee();
		e.CalculateSalary();
	}

}
