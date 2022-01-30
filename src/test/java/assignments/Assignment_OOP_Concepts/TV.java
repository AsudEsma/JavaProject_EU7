package assignments.Assignment_OOP_Concepts;

public class TV {
    private int channel = 1;
    private int volumeLevel = 0;
    private boolean on = false;
    private String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on) {
            if (channel < 1 && channel > 120) {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            } else {
                this.channel = channel;
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on) {
            if (volumeLevel < 0 && volumeLevel > 7) {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            } else {
                this.volumeLevel = volumeLevel;
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int channelUp() {
        if(channel<120) {
            return channel++;
        } else {
            return channel;
        }
    }

    public int channelDown() {
        if(channel>1) {
            return channel--;
        } else {
            return channel;
        }
    }

    public int volumeUp() {
        if(on) {
            if (volumeLevel < 7) {
                return volumeLevel++;
            } else {
                return volumeLevel;
            }
        } else {
            setVolumeLevel(0);
            return volumeLevel;
        }
    }

    public int volumeDown() {
        if(on) {
            if (volumeLevel > 0) {
                return volumeLevel--;
            } else {
                return volumeLevel;
            }
        } else {
            setVolumeLevel(0);
            return volumeLevel;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if(!on) {
            this.on = true;
        } else {
            System.out.println("TV is already ON");
        }
    }

    public void turnOff() {
        if(on) {
            this.on = false;
        } else {
            System.out.println("TV is already OFF");
        }
    }

}
