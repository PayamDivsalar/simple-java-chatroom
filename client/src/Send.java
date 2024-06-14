import java.io.IOException;
import java.util.Scanner;

public class Send implements Runnable {
    User user;

    public Send(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                String message = scanner.nextLine();
                user.out.writeObject(message);
                user.out.flush();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
