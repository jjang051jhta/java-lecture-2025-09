package basic.unchecked;

public class MyUncheckedException extends RuntimeException {
    //checked exception
    public MyUncheckedException(String message) {
        super(message);
    }
}
