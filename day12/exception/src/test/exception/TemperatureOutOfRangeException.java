package test.exception;

public class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException(double c) {
        super("허용되는 센서 온도 -50~60 초과 : "+c+"도");
    }
}
