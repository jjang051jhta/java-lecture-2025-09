package review02.car01;

public class CarMain01 {
    public static void main(String[] args) {
        // 강한 결합
        Driver driver = new Driver();
        K5 k5 = new K5();
        driver.setK5(k5);
        driver.drive();

        Sonata sonata = new Sonata();
        driver.setK5(null);
        driver.setSonata(sonata);
        driver.drive();
        //역할과 구현의 분리
    }
}
