package test;

public class ColorPoint extends Point{
    private String color;
    public ColorPoint(int x, int y) {
        super(x, y);
    }
    public ColorPoint(int x, int y,String color) {
        super(x, y);
        this.color=color;
    }
    public  void setXY(int x, int y) {
        move(x,y); //x,y좌표 변환
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return color+"색의 ("+getX()+","+getY()+")의 점";
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "Yellow");
        String str1 = cp.toString();
        System.out.println("처음 정의된 colorPoint는 "+str1+"입니다.");
        cp.setXY(10,20);
        cp.setColor("Red");
        String str2 = cp.toString();
        System.out.println("이동한 colorPoint는 "+str2+"입니다.");
    }
}
