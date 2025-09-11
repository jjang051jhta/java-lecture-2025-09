package ex02;

public class NetworkService02 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient02 client02 =
                new NetworkClient02(address);
        client02.initError("error01");
        client02.connect();
        client02.send(data);
        client02.disconnect();
    }
}
