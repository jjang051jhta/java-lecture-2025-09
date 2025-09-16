package lamda.lamda01;

import lamda.MyFunction;

public class LamdaSimple01 {
    public static void main(String[] args) {
        MyFunction myFunction01 = new MyFunction() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };
        System.out.println("myFunction01 : " + myFunction01.apply(10, 20));
        MyFunction myFunction02 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("myFunction02 : " + myFunction02.apply(10, 20));
        MyFunction myFunction03 = (int a, int b) ->  a + b;
        System.out.println("myFunction03 : " + myFunction02.apply(10, 20));

        //타입 추론이 가능하다. 매개변수의 타입을 생랴해도 된다.
        MyFunction myFunction04 = ( a, b) ->  a + b;
        System.out.println("myFunction04 : " + myFunction02.apply(10, 20));
    }
}
