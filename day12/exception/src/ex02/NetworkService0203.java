package ex02;

public class NetworkService0203 {
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient02 client02 =
                new NetworkClient02(address);
        client02.initError("error01");
        String connectResult = client02.connect();
        if(!connectResult.equals("success")){
            System.out.println("네트워크 오류 발생 오류 코드 : "+connectResult);
        } else {
            String sendResult = client02.send(data);
            if (!sendResult.equals("success")) {
                System.out.println("네트워크 오류 발생 오류 코드 : " + sendResult);
            }
        }
        client02.disconnect();
    }
}
