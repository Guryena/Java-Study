package Object_and_Instance_2;

public class test2 {
	final double PI = Math.PI;
	double r ;
	double area;
	
	void set_r(double num) {
		r = num;
	}
	double get_r() { 
		return r;	
	}				
	
	double get_area() {
		area = PI *Math.pow(r, 2);
		return area;
	}
}
