package assignments.ReplitAnswers.TableGenerator;

import java.util.Arrays;

public class TestTest {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateTable(1,6)));
        int[] secondary = {2,3,5};
        System.out.println(isPrime(1));
        System.out.println(checkTable(1, secondary));
        System.out.println(checkTableMult(1, secondary));
        secondary = generateTableMult(3,6);
        System.out.println(Arrays.toString(generateTableMult(3,6)));
        System.out.println(checkTableMult(3,secondary));
    }

    public static boolean isPrime(int number) {
        //TODO:
        boolean isPrime = true;
        if(number>=2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        } else {
            isPrime = false;
        }
        return isPrime;
    }

    public static int[] generateTable(int start, int numberOfEntries) {
        //TODO
        int[] primeList = new int[numberOfEntries];
        int count = 0;
        for (int i = 0; count < numberOfEntries; i++) {
            if(isPrime(start+i)) {
                primeList[count] = start+i;
                count++;
            }
        }

        return primeList;
    }

    public static boolean checkTable(int start, int[] tableToTest) {
        //TODO:
        if(tableToTest[0]>=start) {
            int[] checkTable = generateTable(start, tableToTest.length);
            if (Arrays.equals(checkTable,tableToTest)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTableMult(int value, int[] tableToTest) {
        // TODO:
        if(tableToTest[1] == value) {
            int[] checkTable = generateTableMult(tableToTest[1], tableToTest.length);
            if (Arrays.equals(checkTable, tableToTest)) {
                return true;
            }
        }
        return false;
    }

    public static int[] generateTableMult(int value, int numberOfEntries) {
        // TODO:
        int[] table = new int[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            table[i] = value*i;
        }
        return table;
    }
}
