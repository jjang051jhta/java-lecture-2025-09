public class Circle {
    //메서드 area에 올라간다.
    int radius = 10;
    String name;
    double getArea() {
        return radius*radius*3.14;
    }
    void getInfo() {
        System.out.println("나의 이름은 "+name+"이고 반지름은 "+radius+"입니다.");
    }

}
