package review02.car02;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 고릅니다.");
        this.car = car;
    }
    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.speedUp();
        car.offEngine();
    }
}

