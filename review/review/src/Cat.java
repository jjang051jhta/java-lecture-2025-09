public class Cat extends Animal{
    void grooming() {
        System.out.println("그루밍을 합니다.");
    }

    @Override
    void sound() {
        System.out.println("냐옹");
    }
}
