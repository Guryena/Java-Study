
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Receiver extends Thread {
	Socket socket;
	DataInputStream in;
	String name;

	public Receiver(Socket socket) {
		this.socket = socket;

		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (in != null) {
			try {
				System.out.println(in.readUTF()); // UTF is don't crash korea

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
