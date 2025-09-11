package test;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        //5. 이메일의 ID 부분과 도메인 부분을 분리해라  ex) jjang051@hanmail.net
        String email = "jjang051@hanmail.net";
        //   .^$*+?[]{}()|\  이건 정규표현식에서 쓰는 메타문자
        //  즉 위에 있는 메타문자는 escape처리해야한다. 나머지는 그냥 써도 된다.
        String strArray[] = email.split("@");
        System.out.println(Arrays.toString(strArray));
    }
}
