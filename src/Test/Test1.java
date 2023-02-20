package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList();
		
		List<Double> listG = new ArrayList();
		
		for (int i = 0; i < 6; i++) {
			String grade = sc.nextLine();
			list.add(grade);
			if (grade.equals("A")) {
				listG.add(4.0);
			}
			else if (grade.equals("B")) {
				listG.add(3.0);
			}
			else if (grade.equals("C")) {
				listG.add(2.0);
			}
			else if (grade.equals("D")) {
				listG.add(1.0);
			}
			else if (grade.equals("F")) {
				listG.add(0.0);
			}
		}
		
		DoubleSummaryStatistics stats = listG.stream()
                .mapToDouble(Double::doubleValue)
                .summaryStatistics();
		System.out.println(stats.getAverage());
		
	}

	}

