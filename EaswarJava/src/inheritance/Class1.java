package inheritance;
import java.util.*;

public class Class1 {

	    protected double basicPay;
	    protected double deduction;
	    protected double bonus;

	    public void getDetails() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter Basic Pay: ");
	        basicPay = scanner.nextDouble();
	        this.basicPay = basicPay;

	        System.out.println("Enter Deduction Amount: ");
	        deduction = scanner.nextDouble();
	        this.deduction = deduction;

	        System.out.println("Enter Bonus Amount: ");
	        bonus = scanner.nextDouble();
	        this.bonus = bonus;
	    }

	}

        
