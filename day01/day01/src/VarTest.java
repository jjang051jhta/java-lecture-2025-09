import java.sql.Wrapper;

public class VarTest {
    public static void main(String[] args) {
        //변수 variable
        // 정수(byte(1바이트 2에 8승), short(2바이트 2에 16승),int(4바이트 2에 32승), long(8바이트 2에 64승)),
        // 실수(float 2에 32승,double 2에 64승),
        //primitive
        byte byte01 = -128;  // -128 ~ 127
        short short01 = -128;  // -32768 ~ 32767
        int int01 = 2147483647; //-2147483648~2147483647
        long long01 =  1000000000000000000l;

        float float01 = 3.14f;
        double double01 = 3.14;
        // Wrapper 기본타입의 변수를 객체로 둘러싸서
        // 객체에 쓸 수 있는 변수와 메서드를 쓸 수 있게 해준다.
        //System.out.println(Integer.parseInt("10")+Integer.parseInt("10"));
        System.out.println(Byte.MIN_VALUE+" / "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" / "+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" / "+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+" / "+Long.MAX_VALUE);
        String str =  new String("장동건");//객체지만 new 생성자 없이 사용가능
        String myName = "장성호";
        char ch = 'a';
        boolean isTrue = true;
    }
}
