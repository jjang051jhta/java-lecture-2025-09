package test;

import java.io.Serializable;

//직렬화  객체를 byte로 바꾸는 거  객체는 network으로 전송불가능 byte만 전송가능하다.
//역직렬화  byte를 객체로 복원하는 것을 역직렬화라고 한다.
public class Member implements Serializable {
    private String ID;
    private String name;
    private int age;


    public Member(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
