import java.io.IOException;

public class Sender implements Runnable {
    private Server server;
    private User user;

    public Sender(Server server, User user) {
        this.server = server;
        this.user = user;
    }

    public Server getServer() {
        return server;
    }

    public User getUser() {
        return user;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = (String) user.in.readObject();
                for (User u : server.users) {

                        u.out.writeObject(user.name + ": " + message);
                        u.out.flush();

                }
            } catch (Exception e) {

                break;
            }
        }
    }
}
