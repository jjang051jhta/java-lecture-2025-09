package test;

public class ColorTV extends TV {
    //기본 생성자
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }
    public void printProperty() {
        System.out.println(this.getSize()+"인치 "+color+"컬러");
    }
}
