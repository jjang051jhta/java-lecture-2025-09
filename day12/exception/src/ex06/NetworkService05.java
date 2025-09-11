package ex06;

import ex05.exception.ConnectionException05;
import ex05.exception.SendException05;

public class NetworkService05 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient05 client05 =
                new NetworkClient05(address);
        client05.initError(data);
        try{
            client05.connect();
            client05.send(data);
        }  finally {
            client05.disconnect();
        }
    }
}
