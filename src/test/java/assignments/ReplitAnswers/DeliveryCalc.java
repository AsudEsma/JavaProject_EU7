package assignments.ReplitAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCalc {

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int refill = 0;
        int neededFuel = 0;
        int totalFuelNeeded = 0;

        for (int i = 0; i < deliveries.size(); i++) {
            neededFuel += deliveries.get(i);
        }

        totalFuelNeeded = neededFuel;
        if (neededFuel > max_fuel) {
            for (int i = 0; i < totalFuelNeeded && neededFuel > 0; i++) {
                neededFuel -= max_fuel;
                refill++;
            }
        }

        return refill;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));
        in.close();
    }

}
