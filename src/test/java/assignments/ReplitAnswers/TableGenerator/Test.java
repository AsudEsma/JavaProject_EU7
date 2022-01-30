package assignments.ReplitAnswers.TableGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MultiplicationTable table = new MultiplicationTable();
        PrimeNumbersTable primeTable = new PrimeNumbersTable();
        System.out.println(Arrays.toString(table.generateTable(in.nextInt(), in.nextInt())));

        int size = in.nextInt();
        int [] arr = new int[size];
        for(int i= 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(table.checkTable(in.nextInt(), arr));

        System.out.println(Arrays.toString(primeTable.generateTable(in.nextInt(), in.nextInt())));

        size = in.nextInt();
        arr = new int[size];
        for(int i= 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(primeTable.checkTable(in.nextInt(), arr));

    }
}
