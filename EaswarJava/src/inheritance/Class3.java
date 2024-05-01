package inheritance;
import java.util.*;

public class Class3 extends Class2 {


	    public  void SalarySlip() {

	        double totalSalary = basicPay + bonus + hra - pf - deduction;
	        
	        System.out.println("=====================");
	        System.out.println("Salary Slip");
	        System.out.println("=====================");
	        System.out.println("Basic Pay: Rs." + basicPay);
	        System.out.println("Deduction: Rs." + deduction);
	        System.out.println("Bonus: Rs." + bonus);
	        System.out.println("HRA: Rs." +hra);
	        System.out.println("PF: Rs." +pf);
	        System.out.println("=====================");
	        System.out.println("Total Salary: Rs." + totalSalary);
	        System.out.println("=====================");
	    }

	    public static void main(String args[])
	    {
	    	Class3 c = new Class3();
	    	c.getDetails();
	    	c.calculateHRAandPF();
	    	c.SalarySlip();
	    	
	    	
	    }
	}

