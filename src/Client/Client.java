package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	
	public void start() {
			Socket socket = null;
			BufferedReader in = null;
			
			try {
				socket = new Socket("LocalHost", 8000);
				System.out.println("[Server Connect]");
				
				String name = "user"+(int)(Math.random()*10);
				Thread sendThread = new sendThread(socket, name);
				sendThread.start();
				
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (in !=null) {
					String inputMSG = in.readLine();
					if (("Leave the Chat ["+name +"]").equals(inputMSG)) {
						break;
					}
					System.out.println("From : "+ inputMSG);
				}
				
				
			} catch (IOException e) {
				System.out.println("[Disconnect Server]");
			}
			
			finally {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("[Server Connection Closed]");
			
	}

}
