package review04.string;

public class StringEqualMain01 {
    public static void main(String[] args) {
        String str01 = new String("hello");
        String str02 = new String("hello");
        System.out.println("str01 == str02 비교 : "+(str01==str02));
        System.out.println("str01.equals(str02) 비교 : "+(str01.equals(str02)));

        String str03 = "hello"; //리터럴로 선언된 문자열은 String Pool에 저장된다.
        String str04 = "hello";
        System.out.println("str03 == str04 비교 : "+(str03==str04));
        System.out.println("str03.equals(str04) 비교 : "+(str03.equals(str04)));
        //String은 불변객체
        System.out.println(str03.concat(str04));
        System.out.println(str03);
        System.out.println(str03.isEmpty());
        System.out.println(str03.startsWith("h"));
        System.out.println(str03.endsWith("o"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("h");
        stringBuilder.append("e");
        stringBuilder.append("l");
        stringBuilder.append("l");
        stringBuilder.append("o");
        System.out.println(stringBuilder.toString());
        //문자열이 변경이 자주 일어난다. StringBuilder 사용

    }
}
