public class StringMain {
    public static void main(String[] args) {
        String str01 = "abcd"; //리터럴로 생성  String Pool에 생성된다.
        String str04 = "abcd";
        System.out.println(str01==str04);
        char [] data = {'a','b','c','d'};
        String str02 = new String(data); //객체로 생성
        System.out.println(str02);
        System.out.println(str01 == str02);
        System.out.println(str01.equals(str02));
        String str03 = str02;
        System.out.println(str03==str02);
        System.out.println(str01.length());
        System.out.println(str01 == str02.intern()); //String Pool에 있는 동일한 문자열을 들고 온다.
    }
}
