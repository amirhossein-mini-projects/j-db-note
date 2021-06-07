package jdbn.Server;

import java.io.IOException;
import java.net.Socket;
import jdbn.Model.Application;

public class NoteClient
{
    public static final String IP = "127.0.0.1";
    public static final int PORT = 59090;

    public static void main(String[] args)
    {
        Socket socket = null;
        try {
            socket = new Socket(NoteClient.IP, NoteClient.PORT);
            System.out.println("> Connected successfully");

            Application application = new Application(socket);
            application.run();

        } catch (IOException e) {
            System.out.println("> Connection error : " + e.getMessage());
        } finally {
            System.out.println("> Application closed");
        }
    }
}
