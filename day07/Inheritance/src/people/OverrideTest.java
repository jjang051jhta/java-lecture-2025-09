package people;

public class OverrideTest {
    public static void main(String[] args) {
        //오버로딩 컴파일 시점에 바인딩    (정적바인딩)
        //오버라이드 런타임 시점에 바인딩  (동적바인딩)
        Person person01 = new Person("장성호");
        Person person02 = new Student("장동건");
        person01.introduce();
        person02.introduce(); //동적바인딩
    }
}
