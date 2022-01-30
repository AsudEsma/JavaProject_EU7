package assignments.ReplitAnswers;

public class ParkingMeter {
    int timeLeft = 0;
    private int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int num) {
        if(num==25) {
            if(timeLeft+num < maxTime) {
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
