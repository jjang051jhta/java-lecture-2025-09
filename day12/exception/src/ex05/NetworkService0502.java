package ex05;

import ex05.exception.ConnectionException05;
import ex05.exception.NetworkClientException05;
import ex05.exception.SendException05;

public class NetworkService0502 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient05 client05 =
                new NetworkClient05(address);
        client05.initError("error02");
        /*
        try{
            client05.connect();
            client05.send(data);
        } catch (ConnectionException05 e) {
            System.out.println("[연결 오류] 주소 : "+e.getAddress()+", 메세지 : "+e.getMessage());
        } catch (NetworkClientException05 e) {
            System.out.println("[네트웍에 알 수 없는 오류] "+", 메세지 : "+e.getMessage());
        } catch (Exception e) {
            //최후의 보류 뭔지모르르 오류 잡을 때
            System.out.println("[알 수 없는 오류] "+", 메세지 : "+e.getMessage());
        } finally {
            client05.disconnect();
        }

         */
        try{
            client05.connect();
            client05.send(data);
        } catch (ConnectionException05 | SendException05 e) {
            System.out.println("[연결 또는 데이터 전송 오류] 주소 : , 메세지 : "+e.getMessage());
        } catch (NetworkClientException05 e) {
            System.out.println("[네트웍에 알 수 없는 오류] "+", 메세지 : "+e.getMessage());
        } catch (Exception e) {
            //최후의 보류 뭔지모르르 오류 잡을 때
            System.out.println("[알 수 없는 오류] "+", 메세지 : "+e.getMessage());
        } finally {
            client05.disconnect();
        }


    }
}
