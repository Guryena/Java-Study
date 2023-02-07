package Overriding;

public class Overriding {

	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		c1.yummy();
		c2.yummy();

		System.out.println("=========");
		
		
		
		
		
		//declaration
		Shape[] shapeArr = { new Circle(2), 
				new Rectangle(2, 2), new Triangle(2, 2) };
		//logic
		double sum = 0;
		for (Shape shape : shapeArr) {
			sum += shape.getArea();
		}
		System.out.println(sum);
		
		double sum1 = 0;
		for (int i = 0; i < shapeArr.length; i++) {
			sum1 += shapeArr[i].getArea();
		}
		System.out.println(sum1);

		System.out.println(Shape.shapeAllArea(shapeArr));
		
		
		
		
		System.out.println("=========");
		
		Shape cir = new Circle(2);
		System.out.println(cir.getArea());
		Shape rec = new Rectangle(2, 2);
		System.out.println(rec.getArea());
		double area = cir.getArea() + rec.getArea();
		System.out.println(area);

		System.out.println("=========");
		
		Fruit[] fruit = {new Grape("포도"), new Apple("사과"), new Ship("배")}; 
		Fruit.getFruit(fruit);
		
		
	}


}
