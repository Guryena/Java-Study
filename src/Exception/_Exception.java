package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _Exception {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		try {
			int n1 = kb.nextInt();
			System.out.println("a/b... a? ");
			int n2 = kb.nextInt();
			System.out.println("a/b... b? ");

//		System.out.println(n1/n2);
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
		} catch (ArithmeticException | InputMismatchException e) {
			e.getMessage();
		}
		// catch (ArithmeticException e) {
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		catch (InputMismatchException e) {
//			e.printStackTrace();
//		}
		finally {
			System.out.println("파이널리 실행");
		}
		System.out.println("Good bye");
		
	}

}
