package classes.day44_oopreview.callcenter;

public interface IVoiceCallable {

    boolean CAN_CALL = true;
    void Call(String contact);
    static void Decline() {
        System.out.println("The voice call is declined!");
    }
    default void Accept() {
        System.out.println("The voice call is finally accepted.");
    }

}
