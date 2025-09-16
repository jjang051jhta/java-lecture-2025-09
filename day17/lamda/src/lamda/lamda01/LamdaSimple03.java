package lamda.lamda01;

import lamda.Procedure;

public class LamdaSimple03 {
    public static void main(String[] args) {
        MyCall myCall01 = new MyCall() {
            @Override
            public int call(int value) {
                return value*2;
            }
        };
        System.out.println("myCall01==="+myCall01.call(10));
        MyCall myCall02 = (int value) -> value*2;
        System.out.println("myCall02==="+myCall02.call(10));
        MyCall myCall03 = (value) -> value*2;
        System.out.println("myCall03==="+myCall03.call(10));
        MyCall myCall04 = value -> value*2;
        System.out.println("myCall04==="+myCall04.call(10));
        //매개변수가 하나라면 괄호 생략 가능하다.
        //자바스크립트 화살표 함수  fat arrow function
        //자바 화살표 함수  arrow function

    }
    interface MyCall {
        int call(int value);
    }
}
