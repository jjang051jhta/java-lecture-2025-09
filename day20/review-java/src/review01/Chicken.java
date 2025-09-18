package review01;

public class Chicken extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void move() {
        System.out.println("닭이 이동합니다.");;
    }

    @Override
    public void fly() {
        System.out.println("닭이 납니다.");
    }
}
