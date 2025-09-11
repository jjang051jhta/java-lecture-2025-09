package inter;

public interface PhoneInterface {
    int TIME_OUT = 10000;
    void sendCall();
    void receiveCall();
    //default를 쓰면 구현부를 만들 수 있다.
    default void showLogo() {
        System.out.println("===LOGO===");
    }
}
