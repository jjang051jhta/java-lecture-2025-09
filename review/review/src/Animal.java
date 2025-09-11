public abstract class Animal {
    String name;
    int age;
    void eat() {
        System.out.println("먹이를 먹습니다.");
    }
    void sleep() {
        System.out.println("잠을 잡니다.");
    }
    abstract void sound();
}
