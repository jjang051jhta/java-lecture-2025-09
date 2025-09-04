package inter;

public class SmartPhone extends PDA implements MobilePhoneInterface, Mp3Interface {
    @Override
    public void sendSMS() {
        System.out.println("SMS를 보냅니다.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("SMS를 받습니다.");
    }

    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 멈춥니다.");
    }

    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다.");
    }

    public static void main(String[] args) {
        SmartPhone gallaxy = new SmartPhone();
        SmartPhone iphone = new SmartPhone();
    }
}
