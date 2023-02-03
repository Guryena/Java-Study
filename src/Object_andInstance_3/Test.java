package Object_andInstance_3;

public class Test {

	public static void main(String[] args) {
		Grade grade = new Grade();
		grade.init_grade(80, 75, 100);
		System.out.println(grade.kor + " "+grade.eng +" "+ grade.math);
		System.out.println(grade.eng);
		System.out.println(grade.math);
		System.out.println(grade.get_Avg());
		System.out.println(grade.get_Grade());
		
		Grade grd = new Grade();
		grd.init_grade(30, 25, 10);
		System.out.println(grd.get_Avg());
		System.out.println(grd.get_Grade());
		
		
		Triangle triangle_area = new Triangle();
		triangle_area.set_Base(80);
		triangle_area.set_Height(74);
		System.out.println(triangle_area.get_Area());
		
		Triangle triangle_area_if_now_three_base =
				triangle_area;
		triangle_area_if_now_three_base.set_Base(80);
		triangle_area_if_now_three_base.set_Base_left(65);
		triangle_area_if_now_three_base.set_Base_right(80);
		System.out.println
		(triangle_area_if_now_three_base.
				get_Area_now_three_base());
		
		
		
	}

}
