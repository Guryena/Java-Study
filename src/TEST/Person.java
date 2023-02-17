package TEST;

public class Person<NAME, AGE> {
	private NAME name;
	private AGE age;
	
	public void set(NAME name, AGE age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " "  + age +"세 입니다.";
	}
	
	
}
