package Variable;

public class Variable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ���� ������ ��� ������ ������ �� ���� 75, 60, 100�� ������ �� ������ ����Ͻÿ�
		int kor = 75;
		int eng = 60;
		int math = 100;
		double sum = kor + eng + math;
		double num = 3;

		double[] avg_array = {kor, eng, math};
		double avg = 0;
		
		for (int i = 0; i < avg_array.length; i++) {
			avg += avg_array[i];
			}
		
		System.out.println(avg/avg_array.length);
		
		System.out.println(kor + eng + math);
		System.out.println();
		System.out.println(sum);
		System.out.println(sum/num);
	}
}