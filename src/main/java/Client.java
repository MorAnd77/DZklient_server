
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        String host = "localhost";
        int port = 8080;

        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("Сосочки мои! Язычники! Все-ли из вас порадованны? Чиста-ли ваша радость? Так поделимся ею с близкими!");

            System.out.println(in.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


