package InetAdressEx;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx {

	Scanner sc;
	
	public InetAdressEx() {
		System.out.println("Host 이름을 입력하세요.");
		
		sc= new Scanner(System.in);
		try {
			InetAddress inetAddress = InetAddress.getByName(sc.next());
			
			System.out.println("Computer Name : " + inetAddress.getHostName());
			System.out.println("Computer IP : "+inetAddress.getHostAddress());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
