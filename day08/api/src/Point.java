public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point ("+x+","+y+")";
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point)obj;
        return point.x==x && point.y==y?true:false;
    }
}
