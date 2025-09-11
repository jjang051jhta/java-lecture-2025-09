public class ArrayClassTest {
    public static void main(String[] args) {
        //Circle circle01 = new Circle(10);
        //Circle circle02 = new Circle(20);
        //Circle circle03 = new Circle(30);
        Circle [] circles = new Circle[10];
        for(int i=0;i< circles.length;i++) {
            circles[i] = new Circle((i+1)*10);
        }
        System.out.println(circles[2].radius);
        //객체 배열
    }
}
