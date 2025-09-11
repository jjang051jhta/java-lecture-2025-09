package test;

public class Test04 {
    public static void main(String[] args) {
        //"   hello  java  " 공백을 제거하시오.
        String str = "   hello  java  ";
        System.out.println(str.strip());
        //   \s는 공백문자를 뜻한다.
        String noSpace = str.replaceAll("\\s+","");
        System.out.println(noSpace);
    }
}
