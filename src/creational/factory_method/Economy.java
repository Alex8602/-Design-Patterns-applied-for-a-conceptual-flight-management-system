package creational.factory_method;

public class Economy implements SeatClass {
    private int amenities, meals, maxKgLuggage;
    private float price;

    public Economy(int amenities, int meals, int maxKgLuggage, float price) {
        this.amenities = amenities;
        this.meals = meals;
        this.maxKgLuggage = maxKgLuggage;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("\n*** Economy ***");
        System.out.println("\tamenities: " + amenities);
        System.out.println("\tmeals: "+ meals);
        System.out.println("\tmax kilo luggage: " + maxKgLuggage);
        System.out.println("\tprice: " + price);
        System.out.println("-----------------------\n");
    }

    @Override
    public void increasePrice(float percentage) {
        this.price = this.price + price * percentage / 100;
    }

    @Override
    public void decreasePrice(float percentage) {
        this.price = this.price - price * percentage / 100;
    }

    public int getAmenities() {
        return amenities;
    }

    public int getMeals() {
        return meals;
    }

    public int getMaxKgLuggage() {
        return maxKgLuggage;
    }

    public float getPrice() {
        return price;
    }
}
