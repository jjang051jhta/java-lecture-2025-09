package review02.car02;

public class CarMain01 {
    public static void main(String[] args) {
        // 강한 결합
        Driver driver = new Driver();
        Car k5 = new K5();
        driver.setCar(k5);
        driver.drive();

        Sonata sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();

        //운전자의 역할
        //자동차 역할
        //역할과 구현의 분리

        //공연
        //로미오 (장동건  정형돈)
        //줄리엣 (전지현  김태희)
        //역할 인터페이스
        //구현 인터페이스르 구현한 클래스
    }
}
