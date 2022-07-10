package javaBasics;

public class Conversion {
	
	public static double strtoDouble(String str){
		
		return(Double.parseDouble(str));
	}
	
	public static float strtoFloat(String str){
		
		return(Float.parseFloat(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "56";
		
		System.out.println(strtoFloat(str));
		
		Integer in = new Integer(str);
		System.out.println(in);
		
		Double db = new Double(str);
		System.out.println(db);

		int i = 10;
		float f = (float)i;
		System.out.println(f);
		
		char c = 'i';
		System.out.println(String.valueOf(i));
		
		System.out.println(String.valueOf(i));
	}

}
