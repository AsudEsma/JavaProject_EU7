package assignments.ReplitAnswers;

import java.util.Scanner;

public class TVTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(5);
        tv.setVolumeLevel(20);
        System.out.println(tv.getVolumeLevel());


    }
}
