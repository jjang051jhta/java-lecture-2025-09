package abs;

public abstract class Animal {
    //추상클래스 만드는 이유
    //1. 공통된 요소를 만들어서 코드를 재사용
    //2. 메서드의 강제성 부여...
    //3. 다형성
    String name;
    void breathe() {
        System.out.println("숨을 쉽니다.");
    }
    abstract void cry();
}
