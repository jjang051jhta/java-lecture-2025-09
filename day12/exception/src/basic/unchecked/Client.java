package basic.unchecked;

import basic.checked.MyCheckedException;

public class Client {
    public void call() {
        throw new MyUncheckedException("unchecked exception");
    }
}
