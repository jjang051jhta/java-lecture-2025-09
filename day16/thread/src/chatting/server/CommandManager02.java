package chatting.server;

import java.io.IOException;

public class CommandManager02 implements CommandManager {
    private final SessionManager sessionManager;
    private static final String DELIMETER = "\\|";

    public CommandManager02(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String totalMessage, Session session) throws IOException {
        if(totalMessage.startsWith("/join")) {
            String [] split = totalMessage.split(DELIMETER);
            String username = split[1];
            session.setUsername(username);
            sessionManager.sendAll(username+"님이 입장하였습니다.");
        } else if(totalMessage.startsWith("/message")) {
            String [] split = totalMessage.split(DELIMETER);
            String message = split[1];
            sessionManager.sendAll("["+session.getUsername()+"] "+message);
        } else if(totalMessage.startsWith("/change")) {
            String [] split = totalMessage.split(DELIMETER);
            String changeName = split[1];
            sessionManager.sendAll(session.getUsername()+"님이 이름을 "+changeName+"로 이름을 변경하였습니다.");
        } else if(totalMessage.startsWith("/exit")) {
            throw new IOException("exit");
        } else {
            session.send("처리할 수 없는 명령어 입니다."+totalMessage);
        }

    }
}
