package ex06;

public class NetworkService06 {
    public void sendMessage(String data) throws Exception {
        String address =
                "http://www.myserver.com";
        try (NetworkClient06 client06 = new NetworkClient06(address)) {
            client06.initError(data);
            client06.connect();
            client06.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인] : "+e.getMessage());
            throw e;
        }
    }
}
