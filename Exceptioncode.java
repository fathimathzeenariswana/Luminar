package oops;

public class Exceptioncode {
	public static void main(String[] args) {
	double a=5, b=0;
	double c;
	try {
	c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("hello");

	try{
		String s=null;
	System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("hai");
	
	
}
}
