package lamda.lamda01;

import lamda.MyFunction;

public class LamdPassMain03 {
    public static void main(String[] args) {
        //람다를 변수에 대입할 수 있다.
        MyFunction add = getOperation("add");
        MyFunction sub = getOperation("sub");
        MyFunction zero = getOperation("xxx");
        System.out.println(add.apply(10,20));
        System.out.println(sub.apply(10,20));
        System.out.println(zero.apply(10,20));
        //람다는 전달이 가능하다.
        //1. 람다를 변수에 대입 가능
        //2. 람다를 매개 변수에 전달 가능
        //3. 람다를 메서드의 반환타입으로 설정 가능

        //고차(higher-order) 함수(function)
        //고차함수는 함수를 마치 값처럼 다루는 함수를 뜻한다.
        // 보통 두가지중 하나를 만족하면 고차함수라도 부른다.
        //1. 함수를 인자로 받는 함수(메서드)
        //2. 함수를 반환하는 함수(메서드)
        // 자바에서 함수를 주고 받는다는 것은 함수형 인터페이스를 구현한 어떤 객체를 주고 받는 것이다.
        //고차함수의 영어 뜻풀이는 함수라는 개념 자체를 값처럼 다룬다는 점에서 한단계 더 높은 수준이란 의미에서
        //higher order function이라고 부른다.
    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
