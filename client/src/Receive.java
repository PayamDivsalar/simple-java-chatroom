import java.io.IOException;

public class Receive implements Runnable {
    User user;

    public Receive(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        while (true) {
            try {

                String message = (String) user.in.readObject();
                System.out.println(message);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
