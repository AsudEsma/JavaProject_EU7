package assignments.Assignment_OOP_Concepts.Q05;

import java.util.Scanner;

public class Q5 {
    /**
     * Write a custom class TV that has 4 instance variables:
     * int channel=1
     * int volumeLevel=1
     * boolean on = false
     * String brand = "undefined".
     * Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".
     * Also, create one more constructor that defines the instance variable brand
     * and displays the message: "Creating TV object using 1 arg - constructor".
     * Generate getters/setters for:
     * volumeLevel (getVolumeLevel/setVolumeLevel)
     * channel (getChannel/setChannel)
     * and brand (getBrand/setBrand) instance variables.
     * Declare methods channelUp() to increase variable channel by one
     * and channelDown() to decrease variable channel by one.
     * Declare methods volumeUp() to increase variable volume by one
     * and volumeDown() to decrease variable volume by one.
     * Create isOn(), turnOn() and turnOff() methods for "on" instance variable.
     * If the tv is already on, no need to turn it on again
     * and display the message: "TV is already ON".
     * If the tv is already off, then no need to turn it off again
     * and display the message: "TV is already OFF".
     * The value of a variable channel cannot be negative or zero, and cannot be higher than 120.
     * If the user tries to set an invalid channel, display the message: "ERROR: TV is either OFF or invalid Channel".
     * Volume can be only in the range between 1 and 7.
     * You may change volume only if TV is on.
     * Otherwise, display the message:
     * "ERROR: TV is either OFF or invalid Volume level". Create isOn() method that will check tv status.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(in.nextInt());
        in.nextLine();

        TV tv2 = new TV(in.nextLine());
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(in.nextInt());
        tv2.setChannel(in.nextInt());
        tv2.turnOff();
        tv2.setVolumeLevel(in.nextInt());
        tv2.volumeUp();
    }
}
