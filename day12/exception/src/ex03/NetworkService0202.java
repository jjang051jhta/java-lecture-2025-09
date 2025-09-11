package ex03;

public class NetworkService0202 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient03 client02 =
                new NetworkClient03(address);
        client02.initError("error02");
        String connectResult = client02.connect();
        if(!connectResult.equals("success")){
            System.out.println("네트워크 오류 발생 오류 코드 : "+connectResult);
            return;
        }
        String sendResult = client02.send(data);
        if(!sendResult.equals("success")){
            System.out.println("네트워크 오류 발생 오류 코드 : "+sendResult);
            return;
        }
        client02.disconnect();
    }
}
