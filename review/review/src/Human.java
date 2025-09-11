// 자바는 단일상속을 지원한다.
public class Human extends Animal {
    void work() {
        System.out.println("일을 합니다.");
    }
    void study() {
        System.out.println("공부를 합니다.");
    }

    @Override
    void sound() {
        System.out.println("말을 합니다.");
    }
}
