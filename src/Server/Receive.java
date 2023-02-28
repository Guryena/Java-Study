package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Receive extends Thread {
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public Receive(Socket socket) {
		this.socket = socket;
		try {
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			list.add(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String name = null;
		try {
			name = in.readLine();
			System.out.println("["+name+"] new connect");
			send("Enter the Chat [" +name+ "]");
			
			while (in != null) {
				String inputMSG = in.readLine();
				if ("Quit".equals(inputMSG)) {
					break;
				}
				send(name + ">>" + inputMSG);
			}
			
			
		} catch (IOException e) {
			System.out.println("Disconnect ["+name +"]");
			
		}
		finally {
			send("Leave the Chat ["+name +"]");
			list.remove(out);
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Exit [" + name +"]");
		
	}
	
	private void send(String s) {
		for (PrintWriter out : list) {
			out.println(s);
			out.flush();
		}
	}
	
	
	
}
