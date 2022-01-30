package assignments.ReplitAnswers;

public class GasTank {
    private double amount = 0;
    private double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double addedGas) {
        if((amount+addedGas)<capacity) {
            amount += addedGas;
        } else {
            amount = capacity;
        }
    }

    public void useGas(double usedGas) {
        if((amount-usedGas)<0) {
            amount = 0;
        } else {
            amount-=usedGas;
        }
    }
    public boolean isEmpty() {
        return (amount<0.1);
    }

    public boolean isFull() {
        return (amount>capacity-0.1);
    }
    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        double firstAmount = amount;
        amount = capacity;
        return (capacity-firstAmount);
    }
}
