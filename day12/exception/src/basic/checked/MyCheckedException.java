package basic.checked;

public class MyCheckedException extends Exception {
    //예외처리를 다 할 수 있다.
    //예외, 오류 Throwable을 에러까지 처리한다. 프로그래머는 에러처리까지 할 수 없다.
    public MyCheckedException(String message) {
        super(message);
    }
}
