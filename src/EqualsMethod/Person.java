package EqualsMethod;

public class Person {
	private String str;
	
	public Person(String strName) {
		// TODO Auto-generated constructor stub
		str = strName;
	}

	@Override
	public boolean equals(Object obj) {
//		 TODO Auto-generated method stub
		//'equals'function with String type is print what Value in String 
		if (obj instanceof Person) {
			
			Person person = (Person)obj;
			
			if (this.str.equals(person.str)) {
				return true;
			}
		}
		return false;
		
		
//		if (this.str.equals(((Person)obj).str)) {
//			return true;
//		}
		
		//This code is different from code.equals
		//because '==' is compare to reference address
		
//		if (this.str == ((Person)obj).str) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}

}
