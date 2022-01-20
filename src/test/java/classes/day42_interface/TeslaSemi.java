package classes.day42_interface;

public class TeslaSemi extends ElectricTruck {

    private double engineSize;

    public TeslaSemi(String model, double price, String color, double engineSize) {
        super(model, price, color);
        this.engineSize = engineSize;
    }

    @Override
    public void load() {

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
