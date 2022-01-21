package classes.day44_oopreview.callcenter;

public class WhatsApp extends MessagingApp implements IVideoCallable, IVoiceCallable {
    @Override
    public void VideoCall() {
        System.out.println("WhatsApp - doing a video call " + super.name + "...");
    }

    @Override
    public void Call(String contact) {
        System.out.println("WhatsApp - calling to " + contact + ", " + super.name + "...");
    }

    @Override
    public void SendMessage(String msg) {
        System.out.println("WhatsApp - sending a message " + super.name + "...");
        System.out.println("The text is: " + msg);
    }
}
