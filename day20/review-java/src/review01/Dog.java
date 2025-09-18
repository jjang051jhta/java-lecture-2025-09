package review01;

//상속받는다.
//구현한다.
public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개가 이동합니다.");;
    }
}
