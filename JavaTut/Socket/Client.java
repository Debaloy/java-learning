import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            System.out.println("Connection established to server on port 6666");

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello server!!");
            dos.flush();
            System.out.println("Data sent to server");

            System.out.println("Waiting for response from server...");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = (String)dis.readUTF();

            System.out.println("Message from server: " + msg);

            System.out.println("Closing connection...");
            dos.close();
            dis.close();
            s.close();

            System.out.print("All connections and resources closed.");
            System.out.println("Logging out.");
        } catch (Exception e) {
                System.out.println(e);
        }
    }
}