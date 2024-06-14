import java.io.*;
import java.net.Socket;

public class User {
    static int idCounter = 1;
    int id;
    Socket socket;
    ObjectInputStream in;
    ObjectOutputStream out;
    String name;

    public User(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new ObjectInputStream(socket.getInputStream());
        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.id = idCounter++;
        this.name = "User " + id;
    }
}

