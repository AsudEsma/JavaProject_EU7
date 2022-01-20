package classes.day42_interface;

public interface IElectric {

    public static  final boolean HAS_BATTERIES = true;
    boolean HAS_BATTERIES2 = false; // public static final

    public abstract void charge();
    void charge2(); // public abstract  --  You dont need to write it.
}
