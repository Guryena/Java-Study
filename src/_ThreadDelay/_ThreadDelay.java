package _ThreadDelay;

import javax.swing.JOptionPane;

public class _ThreadDelay {

	public static void main(String[] args) {
		String input  = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력한 값은 "+ input +"입니다.");

		Thread th2 = new ThreadDelay2();
		Thread th3 = new ThreadDelay3();
		
		th2.start();
		th3.start();
		
		}
	}


