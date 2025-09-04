package test;

public class Rectangle {
    int x,y,width,height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int square() {
       return width*height;
    }
    void show() {
        System.out.println("("+x+","+y+")에서 크기가"+width+"x"+height+"인 사각형");
    }
    boolean contain(Rectangle rectangle) {
        if(rectangle.x > x &&
                rectangle.y > y &&
                rectangle.x + rectangle.width < x + width &&
                rectangle.y + rectangle.height < y + height) {
            return true;
        }
        return false;
    }
    void showTextBlock() {
        //text block이라고 부름...
        //자바 15이상에서만 쓴다.

        System.out.println("""
                ================================
                (%d,%d)에서 크기가 %d x %d인 사각형
                ================================  
                """.formatted(x,y,width,height));
    }
}
