package review01;

public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("하늘을 납니다.");
    }
    //날아야 한다.
    //~할 수 있는 able
}
