package StringGrammar;

public class _StringBuilder {

	public static void main(String[] args) {
		//Create instance to save String "123"
		StringBuilder strb = new StringBuilder();
		
		strb.append(45678); //Append to String
		System.out.println(strb.toString());
		
		strb.delete(0, 2);//Delete partial String
		System.out.println(strb.toString());
		
		strb.replace(0, 3, "AB");//Replace partial String
		System.out.println(strb.toString());
		
		strb.reverse();//Reverse String
		System.out.println(strb.toString());
		
		String sub = strb.substring(2, 4); //Return partial String
		System.out.println(sub);
	}

}
