package ex03;

public class NetworkService03 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient03 client02 =
                new NetworkClient03(address);
        client02.initError("error01");
        client02.connect();
        client02.send(data);
        client02.disconnect();
    }
}
