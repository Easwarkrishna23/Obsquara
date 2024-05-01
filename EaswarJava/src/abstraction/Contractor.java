package abstraction;

import java.util.Scanner;

public class Contractor {
	
	int pay = 300;
	 
	public void CalculateSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of working Hours : ");
		float time = sc.nextFloat();
		float salary = time * pay ;
		System.out.println("Total Salary per day : " +salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor c = new Contractor();
		c.CalculateSalary();
	}

}
