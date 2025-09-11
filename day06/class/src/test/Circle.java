package test;

public class Circle {
    private int x;
    private int y;
    private int radius;
    public Circle() {
        this(0,0,1);
    }
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        //System.out.println("("+x+","+y+") "+radius);
        System.out.println("""
                (%d,%d) %d
                """.formatted(x,y,radius));
    }
    public double getArea() {
        return radius*radius*3.14;
    }
}
