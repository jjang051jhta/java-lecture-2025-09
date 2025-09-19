package review04.wrapper;

public class WrapperMain01 {
    public static void main(String[] args) {
        int i = 0; //아무것도 할 수 있는게 없다.
        //int - Integer
        //char - Character
        //long - Long
        //double - Double
        //불변객체이다.
        //Integer integer = new Integer(10); //new 를 통해 생성하지 않는다. 오류는 안난다.
        Integer integer = Integer.valueOf(10);
        Integer integer02 = 10;  //Boxing이 된다.
        System.out.println(integer.compareTo(10));
        Integer.parseInt("10");
        System.out.println(Integer.parseInt("10") - 10); // 서버로 전달되는 모든 데이터 문자로 처리된다.
        String age = "30";
        int intAge = Integer.parseInt(age);
        if (intAge > 20) {
            System.out.println("어른입니다.");
        }
        int max = Integer.max(10,20);
        int min = Integer.min(10,20);
        int sum = Integer.sum(10,20);
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        // 단순 계산은 primitive가 훨씬 빠르다...
    }
}
