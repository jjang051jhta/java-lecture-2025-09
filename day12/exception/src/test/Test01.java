package test;

import test.exception.TemperatureOutOfRangeException;

public class Test01 {
    //온도 범위 검사 (Checked)
    //센서 온도(℃)가 -50 ~ 60 범위를 벗어나면
    // TemperatureOutOfRangeException(Checked) 발생하는
    //프로그램을 작성하시오.
    public static void main(String[] args) {
        double c = -45;
        /*
        try {
            checkTemperature(c);
            System.out.println("정상온도입니다. "+c);
        } catch (TemperatureOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
         */
        TemperatureValidator02 temperatureValidator = new TemperatureValidator02();
        temperatureValidator.validate(c);
            //System.out.println("정상온도입니다. "+c);

    }
    static void checkTemperature(double c) throws TemperatureOutOfRangeException {
        if(c < -50 || c > 60) {
            throw  new TemperatureOutOfRangeException(c);
        }
    }
}
