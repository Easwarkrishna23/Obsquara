package abstraction;
import java.util.*;
public class HDFC implements RBI {
	
	float amount;
	float duration;
	
	
	@Override
	public void RecurringDeposit() {
		//Accept Amount and duration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount :");
		float amount = sc.nextFloat();
		System.out.println("Enter the duration :");
		float duration = sc.nextFloat();
		this.amount = amount;
		this.duration = duration;

	}
	public void Total() {
		float intper = 7.0f;
		float interest =( intper /100 )* amount * duration ;
		float total = amount + interest;
		System.out.println("Total amount you will recieve : "  +total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC sc = new HDFC();
		System.out.println("Interest rate is 7% per month.");
		System.out.println("");
		sc.RecurringDeposit();
		sc.Total();
	}

}
