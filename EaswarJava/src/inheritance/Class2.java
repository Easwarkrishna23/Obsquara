package inheritance;

public class Class2 extends Class1{
	
	protected double hra;
	protected double pf;
		
	    public void calculateHRAandPF() {
	    	
	        double hra = basicPay* 0.05; // 5% of basic salary
	        this.hra = hra;
	        double pf = basicPay * 0.20; // 20% of basic salary
	        this.pf = pf;
	    }

	
}
