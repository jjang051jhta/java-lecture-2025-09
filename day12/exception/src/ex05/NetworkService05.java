package ex05;

import ex04.NetworkClient04;
import ex04.NetworkClientException04;
import ex05.exception.ConnectionException05;
import ex05.exception.SendException05;

public class NetworkService05 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient05 client05 =
                new NetworkClient05(address);
        client05.initError("error02");
        try{
            client05.connect();
            client05.send(data);
        } catch (ConnectionException05 e) {
            System.out.println("[연결 오류] 주소 : "+e.getAddress()+", 메세지 : "+e.getMessage());
        } catch (SendException05 e) {
            System.out.println("[전송 오류] 주소 : "+e.getSendData()+", 메세지 : "+e.getMessage());
        } finally {
            client05.disconnect();
        }


    }
}
