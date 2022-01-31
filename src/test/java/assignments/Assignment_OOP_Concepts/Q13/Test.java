package assignments.Assignment_OOP_Concepts.Q13;

import java.util.Arrays;
import java.util.List;

public class Test {
    public final static int[] WHITE = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY = new int[]{64, 64, 64};
    public final static int[] BLACK = new int[]{0, 0, 0};
    public final static int[] RED = new int[]{255, 0, 0};
    public final static int[] PINK = new int[]{255, 175, 175};
    public final static int[] ORANGE = new int[]{255, 200, 0};
    public final static int[] YELLOW = new int[]{255, 255, 0};
    public final static int[] GREEN = new int[]{0, 255, 0};
    public final static int[] MAGENTA = new int[]{255, 0, 255};
    public final static int[] CYAN = new int[]{0, 255, 255};
    public final static int[] BLUE = new int[]{0, 0, 255};
    static List<int[]> colors = Arrays.asList(WHITE,LIGHT_GRAY,GRAY,DARK_GRAY,BLACK,RED,PINK,ORANGE,YELLOW,GREEN,MAGENTA,CYAN,BLUE);
    String[] colorNames = {"WHITE","LIGHT_GRAY","GRAY","DARK_GRAY","BLACK","RED","PINK","ORANGE","YELLOW","GREEN","MAGENTA","CYAN","BLUE"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(colors.get(3)));
        System.out.println(Arrays.compare(colors.get(0), colors.get(5)));

    }
}
