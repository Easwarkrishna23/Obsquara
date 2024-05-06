package polymorphism;

public class Main {

	public static void main(String[] args) {
        // Example usage
        double amount = 100; // Amount of purchase
        Season onSeason = new OnSeason();
        Season offSeason = new OffSeason();

        // Calculate discounts
        double onSeasonDiscount = onSeason.discount(amount);
        double offSeasonDiscount = offSeason.discount(amount);

        // Print discounts
        System.out.println("On Season Discount: " + onSeasonDiscount);
        System.out.println("Off Season Discount: " + offSeasonDiscount);
    }
	
}
