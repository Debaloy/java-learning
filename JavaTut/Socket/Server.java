import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Listening on port 6666...");

            Socket s = ss.accept();
            System.out.println("Client connected");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = (String)dis.readUTF();

            System.out.println("Message from client: " + msg);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello client!");
            dos.flush();

            System.out.println("Data sent to client");

            System.out.println("Closing connection...");
            dis.close();
            dos.close();
            s.close();
            ss.close();

            System.out.print("All connections and resources closed.");
            System.out.println("Logging out.");
        } catch (Exception e) {
                System.out.println(e);
        }
    }
}