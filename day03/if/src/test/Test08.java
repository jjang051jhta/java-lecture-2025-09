package test;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
//        8. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 + - * / 의 네 가지로
//        하고 피연산자는 모두 실수로 한다.
//                피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
//        0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
//
//                연산 >>2+4
//
//        2+4의 계산 결과는 6

        //System.out.println("+"=="+");
        //String aa = new String("aa");
        //String bb = new String("aa");
        //String 을 new 생성자를 통해서 만들면 참조값의 달라진다. 즉 == 비교하면 false이당.
        //만약 내용만 같은걸 따질꺼면 equals를 쓴다.
        //System.out.println(aa.equals(bb));
        //System.out.println(aa==bb);
        //System.out.println("aa".equals("aa"));  // 생성자 없이 "aa" 스트링을 쓰면 String 상수 pool에 등록이 되고
        //이때 또다른 "aa"를 쓰면 기존 상수 pool에서 찾아보고 있으면 같은 주소를 가리킨다.
        //System.out.println("aa"=="aa");  //String 상수 pool

        Scanner scanner = new Scanner(System.in);
        System.out.println("계산해드립니다. ex) 12 + 10");
        int a = scanner.nextInt();
        String operator =  scanner.next();
        int b =  scanner.nextInt();
        int result = 0;
        /*
        if(operator.equals("+")) {
            result = a+b;
        } else if(operator.equals("-")) {
            result = a-b;
        }else if(operator.equals("*")) {
            result = a*b;
        }else if(operator.equals("/")) {
            result = a/b;
        }
         */
        result = switch(operator) {
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> {
                if(b==0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    yield -1;
                } else {
                    yield a/b;
                }
            }
            default -> {
                System.out.println("잘못된 연산입니다.");
                yield -1;
            }
        };
        System.out.printf("%d %s %d = %d",a,operator,b,result);
    }
}
