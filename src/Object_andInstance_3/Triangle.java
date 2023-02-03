package Object_andInstance_3;

public class Triangle {
	double height;
	double base;
	double area;
	double base_left;
	double base_right;
	
	void set_Height(double y){
		height = y;
	}
	
	double get_Height() {
		return height;
	}
	
	void set_Base(double x){
		base = x;
	}
	double get_Base() {
		return base;
	}
	void set_Base_left(double xl){
		base_left = xl;
	}
	double get_Base_left() {
		return base_left;
	}
	void set_Base_right(double xr){
		base_right = xr;
	}
	double get_Base_right() {
		return base_right;
	}
	
	double get_Area() {
		area = (double)((base*height)/2);
		return area;
	}
	double get_Area_now_three_base() {
		double s = (double)
				((base + base_left+base_right)/2);
		area = Math.sqrt(s*(s-base)*(s-base_left)*(s-base_right));
		return area;
	}
	
	
}
