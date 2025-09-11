package test;

public class IPTV extends ColorTV{
    private String ip;
    /*
    public IPTV(int size, int color) {
        super(size, color);
        ip = "127.0.0.1";
    }
    public IPTV(String ip) {
        super(70, 1920*1024);
        this.ip = ip;
    }
     */
    public IPTV(int size, int color, String ip) {
        super(size, color);
        this.ip = ip;
    }

    @Override
    public void printProperty() {
        System.out.println("나의 IPTV ip는 "+ip+"주소의 ");
        super.printProperty();
    }
}
