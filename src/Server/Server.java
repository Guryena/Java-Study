package Server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		Server client = new Server();
		client.start();
	}
	
	public void start() {
		
		ServerSocket sSocket = null;
		Socket socket = null;
		
		try {
			sSocket = new ServerSocket(8000);
			while (true) {
				System.out.println("Connect Wait");
				socket = sSocket.accept();
				
				
				Receive recieve = new Receive(socket);
				recieve.start();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (sSocket != null) {
				try {
					sSocket.close();
					System.out.println("Server Shutdown");
					
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Server Socket Error");
				}
			}
		}
		
	}

}
