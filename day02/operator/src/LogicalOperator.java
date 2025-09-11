public class LogicalOperator {
    public static void main(String[] args) {
        int num01 = 10;
        int num02 = 20;
        System.out.println(num01 > num02 && num01 < num02); //그리고
        System.out.println(num01 > num02 || num01 < num02); //또는
        System.out.println(!(num01 > num02)); //부정
        System.out.println((num01 < num02) ^ (num01 < num02)); //XOR연산
        //삼항연산자... if
        int x = 5;
        int y = 3;
        String result = x > y ? "5는 3보다 큽니다." : "5는 3보다 작습니다.";
        if (x > y) {
            result = "5는 3보다 큽니다.";
        } else {
            result = "5는 3보다 작습니다.";
        }
        //두수의 차를 구하는 식을 삼항연산자로 구하시오,
        int a = 3;
        int b = 5;
        int result02 = a > b ? a-b : b-a;
        System.out.println(result02);
    }
}
