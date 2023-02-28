package Client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class sendThread extends Thread{
	

	Socket socket = null;
	String name;
	
	Scanner	sc = new Scanner(System.in);
	
	public sendThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			PrintStream out = new PrintStream(socket.getOutputStream());
			out.println(name);
			out.flush();
			
			while (true) {
				String outputMSG = sc.nextLine();
				out.println(outputMSG);
				out.flush();
				if (outputMSG.equals("exit")) {
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		
}
