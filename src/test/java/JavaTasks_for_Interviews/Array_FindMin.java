package JavaTasks_for_Interviews;

public class Array_FindMin {
    /**
     * Write a function that can find the maximum number from an int Array
     */

    public int maxValue(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}
