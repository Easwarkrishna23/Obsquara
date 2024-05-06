package polymorphism;

public class OffSeason extends Season {

    public double discount(double amount) {
        return amount * 0.15; // 15% discount
    }
}
