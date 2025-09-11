package ex01;

public class NetworkService01 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient01 client01 =
                new NetworkClient01(address);
        client01.connect();
        client01.send(data);
        client01.disconnect();
    }
}
