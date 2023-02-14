package Test;

import java.util.Scanner;

//- 클래스 Student
//* 필드 : 학교명, 학과, 학번, 8개 평균평점을 저장할 배열로 선언
//* 생성자 : 학교명, 학과, 학번 지정
//* 메소드 average() : 8개 학기 평균평점의 평균을 반환
public class Student extends Person {
	private String schoolName;
	private String major;
	private int studentID;
	private double[] avgGrade = new double[8];

	public Student(String name, int age, String add, String schName, String mj, int sID) {
		this.name = name;
		this.age = age;
		this.address = add;
		this.schoolName = schName;
		this.major = mj;
		this.studentID = sID;
		print();
	}

	public double average() {
		double sum = 0;
		double avg = 0;
		for (double d : avgGrade) {
			sum += d;
		}
		avg = sum / avgGrade.length;
		return avg;
	}

	public void setGrade() {
		Scanner sc = new Scanner(System.in);

		System.out.println(avgGrade.length + "학기 학점을 순서대로 입력하세요.");

		for (int i = 0; i < avgGrade.length; i++) {
			avgGrade[i] = sc.nextDouble();
			System.out.println((i + 1) + "학기 학점 -> " + avgGrade[i]);
		}
		System.out.println(avgGrade.length + "학기 총 평균 평점은 " + average() + "점 입니다.");
		sc.close();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("학교 : " + schoolName);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + studentID);

	}
}
