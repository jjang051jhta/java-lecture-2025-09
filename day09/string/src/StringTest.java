public class StringTest {
    public static void main(String[] args) {
        String a = "hello"; //String pool에 생성
        String b = "java";
        String c = "hello";
        System.out.println(a == b);
        System.out.println(a == c);
        String d = new String("hello");
        String e = new String("java");
        String f = new String("hello");
        System.out.println(d == e);
        System.out.println(d == f); //false  heap에 생성되는 메모리 참조값이 다르다.
        System.out.println(d.equals(f)); //값을 비교한다.
        a.concat("world");
        System.out.println(a); // hello가 출력된다. String은 불변객체이다.
        String aa = a.concat(" world");
        System.out.println(aa);
        System.out.println(a.length()); //hello
        System.out.println(aa.length());
        String empty = " ";
        System.out.println(empty.length());
        System.out.println(empty.isEmpty()); //문자열 길이가 0이면 true 아니면 false
        System.out.println(empty.isBlank()); //문자열 길이가 0이거나 공백문자가 있으면 true
        System.out.println(a.charAt(0));
        //////////////////////////////////////
        String hello = "hello";
        String hello02 = "Hello";
        System.out.println(hello == hello02);
        System.out.println(hello.equals(hello02));
        System.out.println(hello.equalsIgnoreCase(hello02));
        System.out.println("A".compareToIgnoreCase("a"));
        System.out.println("abc".compareTo("abd"));
        //0이면 같은거 -1/1 음수인지 양수인지만 따지면
        System.out.println(a.startsWith("H"));
        System.out.println("hello java".endsWith("java"));
        //contains
        String str02 = "Hello, Java!! Welcome to Java World";
        System.out.println(str02.contains("Java"));
        System.out.println(str02.lastIndexOf("Java"));
    }
}
