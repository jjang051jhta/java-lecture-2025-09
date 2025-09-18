package review01.extend;

public class CarMain {
    public static void main(String[] args) {
        EletricCar eletricCar = new EletricCar();
        eletricCar.move();
        Car car = new EletricCar();
        //부모타입으로 바꿀때는 아무 문제가 없다.
        //자신이 가지고 있는 고유 메서드는 쓸 수 없다.
        //부모는 자식을 담을 수 있는데 자식은 부모를 담을 수 없다. //up , down casting
        EletricCar childCar = (EletricCar) car;
        childCar.charge();
        //오버로딩(여러개 만들기) 오버라이딩(덮어쓰기)

        Car parentCar = new EletricCar();  //
        EletricCar childCar02 = (EletricCar) parentCar;

        Car parentCar02 = new Car();
        EletricCar childCar03 = (EletricCar) parentCar02;

        //   instaceof

        //설명

    }
}
