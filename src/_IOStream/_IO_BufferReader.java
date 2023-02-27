package _IOStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class _IO_BufferReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일: ");
		String src = sc.nextLine();
		
		try(Reader in = new FileReader(src)) {
			int ch;
			while (true) {
				ch = in.read();
				if (ch == -1) {
				break;
				}
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
