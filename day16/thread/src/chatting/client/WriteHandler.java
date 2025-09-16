package chatting.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class WriteHandler implements Runnable {

    private final DataOutputStream output;
    private final Client client;
    private boolean closed = false;
    private static final String DELIMETER = "|";
    public WriteHandler(DataOutputStream output, Client client) {
        this.output = output;
        this.client = client;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            String userName =  inputUsername(scanner);
            output.writeUTF("/join"+DELIMETER+userName);
            while (true) {
                String toSend = scanner.nextLine();
                if(toSend.isEmpty()) continue;
                if(toSend.equals("/exit")){
                    output.writeUTF(toSend);
                    break;
                }
                if(toSend.startsWith("/")) {
                    output.writeUTF(toSend);
                } else {
                    output.writeUTF("/message"+DELIMETER+toSend);
                }
            }
            //클라이언트에서 쓰면 전부 서버로 전달되고 서버에서 모든 client에서 전달
        } catch (IOException e) {
            log(e);
        } finally {
            client.close();
        }
    }
    private static String inputUsername(Scanner scanner) {
        System.out.println("이름을 입력하세요.");
        String userName;
        do {
            userName = scanner.nextLine();
        } while (userName.isEmpty());
        return userName;
    }

    public synchronized void close() {
        if(closed) return;
        try {
            System.in.close(); // Scanner 입력 중지 (사용자의 입력을 닫음)
        } catch (IOException e) {
            log(e);
        }
        closed=true;
        log("readHandler 종료");
    }
}
