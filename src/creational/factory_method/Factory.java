package creational.factory_method;

public interface Factory {
    SeatClass create(SeatClassType type, int amenities, int meals, int maxKgLuggage, float price);
}
