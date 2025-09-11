package test;

public class TV {
    int year;
    int size;
    String brand;
    public TV(String brand, int year, int size) {
        this.year = year;
        this.brand=brand;
        this.size=size;
    }
    void show() {
        System.out.println(brand+"에서 만든 "+year+"년형 "+size+"인치 TV");
    }

    public static void main(String[] args) {
        TV myTV = new TV("LG",2025,70);
        myTV.show();
    }
}
