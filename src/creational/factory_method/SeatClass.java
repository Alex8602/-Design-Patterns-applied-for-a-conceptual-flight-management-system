package creational.factory_method;

public interface SeatClass {
    void display();
    void increasePrice(float percentage);
    void decreasePrice(float percentage);

    float getPrice();
}
