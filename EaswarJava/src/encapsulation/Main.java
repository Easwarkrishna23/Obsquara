package encapsulation;

public class Main {

	public static void main(String[] args) {
        Bank bank = new Bank(); // Create Bank object
        User user = new User(); // Create User object

        int enteredPin = user.getPinFromBank(bank); // Get PIN from user

        // Set PIN in Bank
        bank.setPin(enteredPin);

        // Validate PIN
        if (bank.validatePin(enteredPin)) {
            System.out.println("PIN validated. Withdrawal successful!");
            // Add withdrawal logic here
        } else {
            System.out.println("Invalid PIN. Withdrawal failed!");
        }
    }
	
}
