package test;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입역하세요. ex) 3,4,+");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();
        int result = 0;
        /*
        switch (operator) {
            case "+":
                Add add = new Add(a,b);
                result = add.calculate();
                break;
            case "-":
                Sub sub = new Sub(a,b);
                result = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul(a,b);
                result = mul.calculate();
                break;
            case "/":
                Div div = new Div(a,b);
                result = div.calculate();
                break;
            default:
                System.out.println("연산기호가 잘못되었습니다.");
                System.exit(0);
        }
         */
        result = switch (operator) {
            case "+" -> new Add(a,b).calculate();
            case "-" -> {
                Sub sub = new Sub(a,b);
                yield sub.calculate();
            }
            case "*" ->{
                Mul mul = new Mul(a,b);
                yield mul.calculate();
            }
            case "/" -> {
                Div div = new Div(a,b);
                yield div.calculate();
            }
            default -> {
                System.out.println("연산기호가 잘못되었습니다.");
                yield 0;
            }
        };
        System.out.println("결과 : "+result);
    }
}
