package creational.factory_method;

public class SeatClassFactory implements Factory {

    @Override
    public SeatClass create(SeatClassType type, int amenities, int meals, int maxKgLuggage, float price) {
        return switch (type) {
            case FIRST_CLASS -> new FirstClass(amenities, meals, maxKgLuggage, price);
            case BUSINESS -> new Business(amenities, meals, maxKgLuggage, price);
            case PREMIUM_ECONOMY -> new PremiumEconomy(amenities, meals, maxKgLuggage, price);
            case ECONOMY -> new Economy(amenities, meals, maxKgLuggage, price);
            default -> null;
        };
    }
}
