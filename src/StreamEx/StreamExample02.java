package StreamEx;

import java.util.ArrayList;
import java.util.List;

public class StreamExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Grade> gradeList = new ArrayList<>();
		gradeList.add(new Grade("James", 90, 75, 100));
		gradeList.add(new Grade("John", 80, 60, 50));
		gradeList.add(new Grade("David", 100, 80, 80));
		
		//individual name
		gradeList.stream().forEach(grade -> System.out.println(grade.getName()));
		
		System.out.println("------------------------------");
		
		//individual avg
		gradeList.stream().forEach(
				grade -> {
					//double sum = grade.getEng() + grade.getKor() + grade.getMath();
					//double avg = sum / 3;
					//System.out.println(grade.getName() + " : " + avg);
					
					System.out.println(grade.getName() + " : " + grade.getAvg());
		});
		
		System.out.println("------------------------------");
		
		gradeList.stream().filter(grade -> !grade.getName().contains("D")).forEach(
				grade -> {
					System.out.println(grade.getName() + " : " + grade.getAvg());
				}
				);
		
		System.out.println("------------------------------");
		
		gradeList.stream().filter(grade -> {return grade.getKor() >= 90;})
							.forEach(grade ->{
							System.out.println(grade.getName() + " : " + grade.getAvg());
							});
	}

}
