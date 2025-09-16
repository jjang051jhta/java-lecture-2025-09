package lamda.lamda01;

import lamda.MyFunction;

public class MyFunctionMain02 {
    public static void main(String[] args) {
        //람다는 이름이 없는 익명 함수이다.
        MyFunction myFunction = (int a, int b) -> {
            return a + b;
        };
        int result = myFunction.apply(10, 10);
        System.out.println(result);
    }
}
