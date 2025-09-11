package people;

public class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
    //동적 (run time을 의미한다.)
    //오버라이딩은 동적바인딩을 한다.
    @Override
    public void introduce() {
        System.out.println("나는 학생입니다.");
        //super.introduce();
    }
    //오버라이드의 조건 이름과 매개변수 타입과 갯수 리턴타입이 같아야 한다.
    public void study() {
        System.out.println("나는 학생이라 공부해야 합니다.");
    }

}
