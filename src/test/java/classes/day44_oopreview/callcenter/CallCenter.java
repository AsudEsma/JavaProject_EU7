package classes.day44_oopreview.callcenter;

public class CallCenter {
    public static void main(String[] args) {

        WhatsApp wa = new WhatsApp();
        wa.Launch();
        wa.allOSCompatible=true;
        wa.isFree=true;
        wa.name="WhatsApp";
        wa.Call("Asu");
        wa.SendMessage("Thank you <3");
        wa.VideoCall();
        wa.Accept();

        IVoiceCallable.Decline();
        System.out.println(IVoiceCallable.CAN_CALL);

        wa.getCount();
        wa.setCount(4);

        System.out.println("***********************");

        MessagingApp ma = new WhatsApp();
        ma.Launch();
        ma.allOSCompatible=true;
        ma.isFree=true;
        ma.name="WhatsApp";
//      ma.Call("Asu");     // We dont have the access to IVoiceCallable

        ma.SendMessage("Thank you <3");

//      ma.VideoCall();     // We dont have the access to IVoiceCallable
//      ma.Accept();

        System.out.println("***********************");

        IVoiceCallable obj = new WhatsApp();
        ( (MessagingApp) obj).Launch();
        ( (WhatsApp) obj).Launch();

        ( (MessagingApp) obj).allOSCompatible=false;
        obj.Call("Mr Tim");

//      ( (MessagingApp) obj).VideoCall();      // We dont have the access to IVoiceCallable
        ( (WhatsApp) obj).VideoCall();
        ( (IVideoCallable) obj).VideoCall();

    }
}
