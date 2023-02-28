import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		String serverIP = "127.0.0.1"; // It's myself IP
		try {
			Socket socket = new Socket(serverIP, 7777);

			System.out.println("Connect Server");

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
