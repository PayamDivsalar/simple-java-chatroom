import java.io.EOFException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Server server = new Server(9880);
            server.addUser();
        } catch (Exception e) {

        }

    }
}