package lamda.lamda01;

import lamda.MyFunction;

public class LamdPassMain02 {
    public static void main(String[] args) {
        //람다를 변수에 대입할 수 있다.
        MyFunction add = (int a, int b) -> a + b;
        MyFunction sub = (int a, int b) -> a - b;
        System.out.println("매개 변수를 통해 전달");
        calculate(add);
        calculate(sub);
        System.out.println("람다를 직접 전달");
        calculate((a,b) ->  a+b);
        calculate((a,b) ->  a-b);
    }

    static void calculate(MyFunction function) {
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int result = function.apply(a,b);
        System.out.println("계산 결과 : "+result);
    }
}
