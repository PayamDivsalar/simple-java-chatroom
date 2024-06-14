import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class User {
    Socket socket;
    ObjectInputStream in;
    ObjectOutputStream out;

    public User() throws IOException {
        socket = new Socket("localhost", 9880);
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
        startChat();
    }

    public void startChat() {
        Thread receive = new Thread(new Receive(this));
        Thread send = new Thread(new Send(this));
        receive.start();
        send.start();
    }
}
