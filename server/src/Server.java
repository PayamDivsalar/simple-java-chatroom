import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    ServerSocket serverSocket;
    ArrayList<User> users = new ArrayList<>();

    public Server(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }

    public void addUser() {
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                User user = new User(socket);
                users.add(user);
                Sender sender = new Sender(this, user);
                Thread thread = new Thread(sender);
                thread.start();

                // Notify the user that they are connected
                user.out.writeObject("Connected to the server.");
                user.out.flush();
            }
        } catch (IOException e) {

        }

    }


}