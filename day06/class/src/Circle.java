public class Circle {
    int radius;
    //생성자가 없으면 default 생성자(constructor)를 하나 만들어 둔다.
    void setRadius(int radius) {
        this.radius=radius;
    }
    double getArea() {
        return radius*radius*3.14;
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 10;
    }
}
