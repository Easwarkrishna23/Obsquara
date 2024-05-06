package polymorphism;

public class OnSeason extends Season {

    public double discount(double amount) {
        return amount * 0.4; // 40% discount
    }
}
