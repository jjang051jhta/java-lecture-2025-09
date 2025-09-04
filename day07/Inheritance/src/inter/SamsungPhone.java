package inter;

public class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("딴딴딴따라");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔습니다.");
    }
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }

    public static void main(String[] args) {
        SamsungPhone gallaxy = new SamsungPhone();
        gallaxy.sendCall();
        gallaxy.receiveCall();
        gallaxy.showLogo();
        gallaxy.flash();
    }

}
