package assignments.Assignment_OOP_Concepts.Q07;

public class GasTank {
    private double amount = 0;
    private double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double addedGas) {       // capacity = 100   amount = 65     addedeGas = 40
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
