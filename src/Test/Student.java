package Test;

public class Student {
	private String name;
	private String department;
	private int studentID;
	private double grade;
	
	public Student(String name, String dep, int ID, double grade) {
		this.name = name;
		this.department = dep;
		this.studentID = ID;
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " +department +", " + studentID +","+ grade;
	}
	
	public void showInfo() {
		 System.out.println("이름: " + name);
	      System.out.println("학과: " + department);
	      System.out.println("학번: " + studentID);
	      System.out.println("학점평균: " + grade);

	}
	
	
	
}
