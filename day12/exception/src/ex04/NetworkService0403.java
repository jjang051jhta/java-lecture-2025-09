package ex04;

public class NetworkService0403 {
    //예외처리 정말 중요합니다.
    //모든 걸 조건문으로 처리 불가능하다. 코드가 복잡해진다.
    //조건 처리가능한 것들은 하고 그렇지 않은 것들은 예외 처리한다.
    //외부리소스 참조할때는 보통 checked exception
    public void sendMessage(String data) {
        String address =
                "http://www.myserver.com";
        NetworkClient04 client04 =
                new NetworkClient04(address);
        client04.initError("error01");

        try {
            client04.connect();
            client04.send(data);
        } catch (NetworkClientException04 e) {
            System.out.println("오류 코드 : "+e.getErrorCode()+", 메세지 : "+e.getMessage());
        } finally {
            client04.disconnect();
        }

    }
}
