package _URLConnection;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class _URLconnection {

	public _URLconnection() {
		String code = null;
		System.out.println("Input WebAddress");
		Scanner sc = new Scanner(System.in);
		String address = sc.next();
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("C:\\Users\\USER\\Desktop\\file.html", false);
			
			while ((code = webData.readLine()) != null) {
				fw.write(code);
				
			}
			System.out.println("The End");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
