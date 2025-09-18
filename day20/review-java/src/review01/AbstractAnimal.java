package review01;

//순수 추상 클래스
abstract public class AbstractAnimal {
    public abstract void sound();
    public void move() {
        System.out.println("동물이 이동합니다.");
    };
}
