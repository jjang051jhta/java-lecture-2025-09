package start;

public class Ex01Main {
    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("hello java");
        System.out.println("프로그램 종료");
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("hello spring");
        System.out.println("프로그램 종료");
    }
    public static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println(str);
        System.out.println("프로그램 종료");
        //프로그래밍에서는 중복제거하는게 중요
    }


    public static void main(String[] args) {
        //helloJava();
        //helloSpring();
        hello("java");
        hello("spring");
    }
}

