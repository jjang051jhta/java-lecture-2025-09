package ex04;

public class NetworkService0402 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient04 client04 =
                new NetworkClient04(address);
        client04.initError("error01");

        try {
            client04.connect();
        } catch (NetworkClientException04 e) {
            System.out.println("오류 코드 : "+e.getErrorCode()+", 메세지 : "+e.getMessage());
            return;
        }
        try {
            client04.send(data);
        } catch (NetworkClientException04 e) {
            System.out.println("오류 코드 : "+e.getErrorCode()+", 메세지 : "+e.getMessage());
            return;
        }
        client04.disconnect();
    }
}
