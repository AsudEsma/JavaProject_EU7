package assignments.Assignment_OOP_Concepts.Q06;

public class ParkingMeter {
    int timeLeft = 0;
    private int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int num) {
        if(num==25) {
            if(timeLeft+25 < maxTime) {
                timeLeft += 30;
                return true;
            }
        }
        return false;
    }

    public void tick() {
        if(timeLeft>0) {
            timeLeft--;
        }
    }

    public boolean isExpired() {
        if(timeLeft==0) {
            return true;
        }
        return false;
    }
}
