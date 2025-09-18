package review01;

public class Student {
    //접근 제어자
    //1. private
    //2. default   (같은 패키지 내에서 호출 허용)
    //3. protected (상속을 받으면 패키지 달라도 호출 허용)
    //4. public
    private String name;
    private int id;
    private String  nickName;
    private int grade;
    private int age;

    public Student(String name, int id, String nickName, int grade, int age) {
        this.name = name;
        this.id = id;
        this.nickName = nickName;
        this.grade = grade;
        this.age = age;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }
    //세상 모든 것은 클래스로 만들 수 있다.

}
