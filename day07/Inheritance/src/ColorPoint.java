public class ColorPoint extends Point {
    //private int x,y;
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public ColorPoint() {
        super(0,0);
    }
    public ColorPoint(int x,int y,String color) {
        super(x,y);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color +" / ");
        showPoint();
    }
}
