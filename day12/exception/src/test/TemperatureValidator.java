package test;

import test.exception.TemperatureOutOfRangeException;

public class TemperatureValidator {
    public void validate( double c) throws TemperatureOutOfRangeException {
        if(c < -50 || c > 60) {
            throw  new TemperatureOutOfRangeException(c);
        }
    }
}
