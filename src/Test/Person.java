package Test;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age % 100;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (toString().equals(((
				(Person)obj).toString()))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +"("+age+"세)";
	}
	
	
	
	
	
}
