package review01;

public class Cat extends AbstractAnimal {
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이가 이동합니다.");
    }
}
