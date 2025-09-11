package ex04;

public class NetworkClient04 {
    //주소
    private final String address;
    public boolean connectError;
    public boolean sendError;
    //생성자 주입
    public NetworkClient04(String address) {
        this.address = address;
    }
    public void connect() throws NetworkClientException04 {
        if(connectError){
            throw new NetworkClientException04("connectError",address+" 서버 연결 실패");
        }
        System.out.println(address+ " 서버 연결 성공");
    }
    public void send(String data) throws NetworkClientException04 {
        if(sendError) {
            throw new NetworkClientException04("sendError", address + " 서버에 데이전 전송 실패 : "+data);
        }
        System.out.println(address+" 서버에 데이터 전송 : "+data);
    }
    public void disconnect() {
        System.out.println(address+ " 서버 연결 해제");
    }
    public void initError(String data) {
        if(data.contains("error01")){
            connectError = true;
        }
        if(data.contains("error02")) {
            sendError = true;
        }
    }
}
