package encapsulation;

public class Bank {

	
	    private int pin; // Encapsulated PIN number

	    // Method to set PIN
	    public void setPin(int pin) {
	        this.pin = pin;
	        System.out.println("PIN set successfully.");
	    }

	    // Method to validate PIN
	    public boolean validatePin(int enteredPin) {
	        return this.pin == enteredPin;
	    }
	
	
}
