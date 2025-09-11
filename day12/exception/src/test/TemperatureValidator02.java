package test;

import test.exception.TemperatureOutOfRangeException;

public class TemperatureValidator02 {
    public void validate( double c)  {
        try {
            if(c < -50 || c > 60) {
                throw  new TemperatureOutOfRangeException(c);
            }
            System.out.println("정상온도입니다. "+c);
        } catch (TemperatureOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
