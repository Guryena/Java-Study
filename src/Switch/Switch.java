package Switch;

public class Switch {

	public static void main(String[] args) {
		int n = 1;
		
		switch (n) {
		case 1:
			System.out.println("simple java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming language");
			break;		
		}
		
		System.out.println("Do you like Java?");
		
		
		int season = 5;
		switch (season) {
		case 1:
		case 2:
		case 3:
			System.out.println("�ܿ�");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("��");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("����");
			break;
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("������ �ƴմϴ�");
			break;
			
			
			
		}
		
	}

}
