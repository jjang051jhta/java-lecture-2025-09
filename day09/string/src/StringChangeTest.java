public class StringChangeTest {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";
        System.out.println("인덱스 7부터 나머지 문자열 : "+str.substring(7));
        System.out.println("인덱스 7부터 나머지 문자열 : "+str.substring(7,11));
        System.out.println("문자열 연결 : "+str.concat("!!!"));
        System.out.println("문자열 변경 : "+str.replace("Java","Python"));
        System.out.println("문자열  : "+str);
        String str02 = "   Hello, Java! Welcome to Java    ";
        System.out.println(str02.toLowerCase());
        System.out.println(str02.toUpperCase());
        System.out.println(str02.trim()+"!!");   //앞뒤 공백 제거
        System.out.println(str02.strip()+"!!");
        System.out.println(str02.stripLeading()+"!!");
        System.out.println(str02.stripTrailing()+"!!");
        String str03 = "  hello\u2003\u2003";
        System.out.println("["+str03.trim()+"]");
        System.out.println("["+str03.strip()+"]");
    }
}
