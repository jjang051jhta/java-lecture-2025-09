public class MethodOverloading {
    int getSum(int a, int b) {
        return a+b;
    }
    int getSum(int a, int b, int c) {
        return a+b+c;
    }
    double getSum(double a, double b) {
        return a+b;
    }
    //메서드 오버로드는 이름이 같은 메서드를 여러개 만들어서 쓰는 것을 말한다.
    //메서드 오버로드의 규칙
    //1. 매개변수의 갯수 또는 타입이 서로 달라야 한다.
    //2. 리턴값은 해당하지 않는다.
}
