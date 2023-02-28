import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // Create Server socket
		Socket socket = null; // Create Client socket

		try {
			serverSocket = new ServerSocket(7777); // 7777=port number
			socket = serverSocket.accept(); // Accept to Server

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
