public class Rect {
    int width;
    int height;
    String name;
    int getArea() {
        return  width*height;
    }
    void getInfo() {
        System.out.println("나의 이름은 "+name+"이고 넓이는 "+width+",  높이는 "+height+"입니다.");
    }
}
