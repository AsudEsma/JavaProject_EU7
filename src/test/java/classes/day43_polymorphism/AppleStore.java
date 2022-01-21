package classes.day43_polymorphism;

public class AppleStore {
    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();
//      mac.code();     // No access!!

        Mac myMac = new Mac();
        myMac.use();;
        myMac.code();

        AppleDevice ipad = new iPad();
        ipad.use();

        iPad myiPad = new iPad();
        myiPad.use();
        myiPad.draw();

        AppleDevice iphone = new iPhone();
        iphone.use();

        iPhone myiPhone = new iPhone();
        myiPhone.use();
        myiPhone.text();

        AppleDevice appleWatch = new AppleWatch();
        appleWatch.use();

        AppleWatch myAppleWatch = new AppleWatch();
        myAppleWatch.use();
        myAppleWatch.train();

    }
}
