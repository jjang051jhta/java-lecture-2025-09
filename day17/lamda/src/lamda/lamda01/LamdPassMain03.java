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
