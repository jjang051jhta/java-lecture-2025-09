package chatting.server;

import java.io.IOException;

public class ServerMain {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        SessionManager sessionManager=new SessionManager();
        CommandManager commandManager = new CommandManager01(sessionManager);
        Server server = new Server(PORT,sessionManager,commandManager);
        server.start();
    }
}
