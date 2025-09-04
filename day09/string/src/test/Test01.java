package test;

public class Test01 {

    public static void main(String[] args) {
        //주어진 url이 https://www.daum.net가 https로 시작하는지 판별하는 코드를 작성하시오.
        String url = "https://www.daum.net";
        boolean result = url.startsWith("https://");
        System.out.println(result);
    }
}
