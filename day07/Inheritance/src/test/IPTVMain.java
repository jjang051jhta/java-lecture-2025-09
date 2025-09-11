package test;

public class IPTVMain {
    public static void main(String[] args) {
        IPTV iptv = new IPTV(70,1920*1024,"192.163.0.81");
        iptv.printProperty();
    }
}
