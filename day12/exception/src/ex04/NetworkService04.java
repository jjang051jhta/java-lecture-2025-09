package ex04;

public class NetworkService04 {
    public void sendMessage(String data) throws NetworkClientException04 {
        String address =
                "http://www.myserver.com";
        NetworkClient04 client04 =
                new NetworkClient04(address);
        client04.initError("error01");
        client04.connect();
        client04.send(data);
        client04.disconnect();
    }
}
