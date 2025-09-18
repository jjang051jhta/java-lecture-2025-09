package review01.extend;

public class EletricCar extends Car {
    //다형성 Poly Morphism
    private int speed;
    public EletricCar() {
    }

    public EletricCar(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("열라 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("전기 충전합니다.");
    }
}
