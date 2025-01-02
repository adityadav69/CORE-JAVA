import java.net.*;
public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://google.com");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());

           
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
