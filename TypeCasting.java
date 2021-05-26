package CoreJavaPractice;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit Conversion
		System.out.println("Implicit TypeCasting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("value of d:"+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
		System.out.println("/n");
		
		//Explicit Casting
		 double x=45.5;
		 int y=(int)x;
		 System.out.println("Value of X:"+x);
		 System.out.println("Value of y"+y);

	}

}
