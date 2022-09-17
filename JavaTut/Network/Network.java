import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;

public class Network {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter url:");
        String url = "http://" + scanner.nextLine();

        try {
            InetAddress ip = InetAddress.getByName(new URL(url).getHost());

            System.out.println("Address: " + ip);

            System.out.println("System IP: " + InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
