package classes.day42_interface;

public class Ford extends ElectricCar {

    private int year;

    public Ford(String model, double price, String color, int year) {
        super(model, price, color);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void start() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void drive() {

    }
}
