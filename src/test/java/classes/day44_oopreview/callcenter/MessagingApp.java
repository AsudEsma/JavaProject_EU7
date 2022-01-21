package classes.day44_oopreview.callcenter;

public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private static int count;
    public static final String APP_TYPE = "Messanger";

    public MessagingApp() {
        System.out.println("MessangerApp no-args constructor...");
    }

    public abstract void SendMessage(String msg);

    public void Launch() {
        System.out.println("The app is launching...");
    }

    public static void close() {
        System.out.println("The app is closing...");
    }

    public static void setCount(int count) {
        MessagingApp.count = count;
    }

    public static int getCount() {
        return count;
    }
}
